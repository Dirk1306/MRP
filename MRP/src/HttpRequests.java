import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpRequests {
    public void sendLoginRequest(String username, String password) {
        Gson gson = new Gson();
        try{
            LoginRequest loginRequest = new LoginRequest(username, password);
            String json = gson.toJson(loginRequest);
            URI uri = URI.create("http://localhost:8080/api/users/register");

            String formData = "username=" + username + "&password=" + password;

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .build();
            HttpClient client = HttpClient.newHttpClient();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());
        } catch(IOException | InterruptedException e){
            e.printStackTrace();
        }
    }
    static class LoginRequest {
        String username;
        String password;

        public LoginRequest(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}


