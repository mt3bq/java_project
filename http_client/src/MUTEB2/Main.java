package MUTEB2;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) {
        HttpClient client= HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();

        HttpRequest request=HttpRequest.newBuilder()
                .GET()
                .uri((URI.create("https://www.google.com")))
                .build();
        HttpResponse<String> response= client.send(request,HttpResponse.BodyHandler.class);
        int length=response.body().length();
        System.out.println("lENGTH"+length);

    }
}
