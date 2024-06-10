package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        class main {
            public static void main(String[] args) {
                if (args.length != 1) {
                    System.out.println("Print java access: source");
                String filePath = "nick.txt";
   try {
           FileReadTask fileReadTask = new FileReadTask(filePath);
                Thread thread = new Thread(fileReadTask);
                thread.start();
                thread.join();
                } catch (InterruptedException e){
                    System.out.println(e);
   }
                    //System.out.println("The thread was interrupted: " + e.getMessage());

                }
            }
        }
    }
}
