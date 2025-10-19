package handler;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import model.UserModel;
import service.IUserService;
import service.UserService;

import com.google.gson.Gson;

import java.io.IOException;

public class UserHandler implements HttpHandler {

    private IUserService userService;


    public UserHandler(IUserService userService) {
        this.userService = userService;
    }

    public boolean login(String username, String password) {
        if(username == null || password == null){
            return false;
        }

        return userService.login(username, password);
    }

    public boolean register(String username, String password) {
        return userService.register(username, password);
    }


    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String method = exchange.getRequestMethod(); // "POST", "GET" oder "DELETE"
        String contextPath = exchange.getHttpContext().getPath();     // den Pfad "/user"
        String fullPath   = exchange.getRequestURI().getPath();       // den vollen Pfad z.B. "/user/login"
        String subPath    = fullPath.substring(contextPath.length()); // "/login", "/register" oder ""
        Gson gson = new Gson();

        try {
            if ("POST".equals(method) && "/login".equals(subPath)) {
                String query = new String(exchange.getRequestBody().readAllBytes());

                LoginRequest loginData = gson.fromJson(query, LoginRequest.class);

                if(login(loginData.username, loginData.password)){
                    send(exchange, 200, "Login erfolgreich!");
                }else{
                    send(exchange, 300, "Sie muessen sich zuerst registieren");
                };
            } else if ("POST".equals(method) && "/register".equals(subPath)) {
                String query = new String(exchange.getRequestBody().readAllBytes());

                RegisterRequest registerData = gson.fromJson(query, RegisterRequest.class);

                if(register(registerData.username, registerData.password)){
                    send(exchange, 201, "Registrierung erfolgreich!");
                }else{
                    send(exchange, 301, "Sie haben bereits einen Account");
                };
            } else {
                send(exchange, 404, "Not found!");
            }
        } catch (IllegalArgumentException e) {
            send(exchange, 400, e.getMessage());
        } catch (Exception e) {
            send(exchange, 500, "Internal server error");
        }
    }

    public void send(HttpExchange exchange, int status, String message) throws IOException {
        String response = "Status " + status + "\n" + message;
        exchange.sendResponseHeaders(status, response.length());
        exchange.getResponseBody().write(response.getBytes());
        exchange.close();
    }

    static class LoginRequest{
        String username;
        String password;
    }

    static class RegisterRequest{
        String username;
        String password;
    }
}
