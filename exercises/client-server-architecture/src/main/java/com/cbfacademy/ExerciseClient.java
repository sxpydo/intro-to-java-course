package com.cbfacademy;

import java.io.*;
import java.net.*;

public class ExerciseClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 4040);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            String message = "Cats and birds are cool!";
            out.println(message);
            System.out.println("Sent message to server: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}