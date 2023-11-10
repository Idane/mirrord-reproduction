package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = args[0];
        long startTime = System.currentTimeMillis();
        System.out.println("Starting to read");
        try (InputStream inputStream = new FileInputStream(filePath)) {
            int content;
            StringBuilder a = new StringBuilder();
            while ((content = inputStream.read()) != -1) {
                a.append((char) content);
            }
        }
        System.out.printf("Time taken: %d ms%n", System.currentTimeMillis() - startTime);
    }
}
