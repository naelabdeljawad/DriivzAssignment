package org.driivz.infra;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.driivz.pojo.Posts;

public class API_Calls {

    public static void main(String[] args) {
        // Set the base URL for the API
        RestAssured.baseURI = "https://driivz.com/news-buzz/";

        // Send GET request and receive the response
        Response response = RestAssured.get("/posts");

        // Get the status code from the response
        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);

        // Get the response body as a string
        String responseBody = response.getBody().asString();
        System.out.println("Response Body: " + responseBody);

        // Create a Gson instance
        Gson gson = new Gson();

        // Map the JSON response to a Java object
        Posts responseObject = gson.fromJson(responseBody, Posts.class);

    }

}
