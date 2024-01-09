package TestingMain;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
public class Testing2 {




        public static void main(String[] args) {
            String apiUrl = "https://fastapi-example-713q.onrender.com/login";
            String email = "user@example.com";
            String password = "string";

            try {
                // Create URL object
                URL url = new URL(apiUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                // Set the request method to POST
                connection.setRequestMethod("POST");

                // Enable input/output streams
                connection.setDoOutput(true);

                // Create the form data
                String formData = "username=" + email + "&password=" + password;

                // Write the form data to the output stream
                try (OutputStream os = connection.getOutputStream()) {
                    byte[] input = formData.getBytes(StandardCharsets.UTF_8);
                    os.write(input, 0, input.length);
                }

                // Get the response code
                int responseCode = connection.getResponseCode();

                // Read the response
                StringBuilder response = new StringBuilder();
                try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
                    String responseLine = null;
                    while ((responseLine = br.readLine()) != null) {
                        response.append(responseLine.trim());
                    }
                }

                // Print the response
                System.out.println("Response Code: " + responseCode);
                System.out.println("Response Body: " + response.toString());

                // Close the connection
                connection.disconnect();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }



}
