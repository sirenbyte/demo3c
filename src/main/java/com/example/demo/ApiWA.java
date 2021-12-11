package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ApiWA {
    private static String APIURL = "https://api.chat-api.com/instance381903/";
    private static String TOKEN = "lgh32njby8wde0oo";


    public static CompletableFuture<Void> postJSON(URI uri, Map<String, String> map) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(map);

        HttpRequest request= HttpRequest.newBuilder(uri)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        return HttpClient.newHttpClient()
                .sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::statusCode)
                .thenAccept(System.out::println);
    }

    public static void sendChatId(String chat_id) throws IOException {
        URI uri = URI.create(APIURL + "sendMessage?token=" + TOKEN);
        Map<String, String> map = new HashMap<String, String>();
        map.put("body", "Your ID: " + chat_id);
        map.put("phone", chat_id);
        ApiWA.postJSON(uri, map);
    }
}
