import com.sun.net.httpserver.HttpServer;
import handler.UserHandler;
import model.UserModel;
import persistence.IUserRepository;
import persistence.UserSqlRepository;
import service.IUserService;
import service.UserService;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {

    public static void main(String[] args) throws IOException {

        UserModel userModel = new UserModel("admin", "password", "test@gmail.com");

        IUserRepository repository = UserSqlRepository.getInstance();
        IUserService userService = UserService.getInstance(repository);

        UserHandler userHandler = new UserHandler(userService);

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/api/users", userHandler);
        server.start();
        System.out.println("Server läuft auf http://localhost:8080");

        // HttpRequests requests = new HttpRequests();
        // requests.sendLoginRequest("admin", "password");
    }

}
