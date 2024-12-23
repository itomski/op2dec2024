package de.lubowiecki.playground.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class HttpDataReader {

    public static void main(String[] args) {

        final String URL = "https://my-json-server.typicode.com/typicode/demo/posts";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(URL))
                                .build();

        try {
            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    .thenApply(HttpDataReader::parseJson)
                    .join();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static String parseJson(String json) {

        final ObjectMapper mapper = new ObjectMapper();
        CollectionType type = mapper.getTypeFactory().constructCollectionType(List.class, Post.class);
        try {
            List<Post> posts = mapper.readValue(json, type);
            System.out.println(posts);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
