package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileReadTask implements Runnable {
    private String filePath;

    public FileReadTask(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (InputStream inputStream = new FileInputStream(filePath)) {
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());

        }
    }
}