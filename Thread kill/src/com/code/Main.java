package com.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static String command = "";

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            while (!command.equalsIgnoreCase("exit")) {
                System.out.println("下载中...");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("执行完成!");
        });
        t1.start();

        try (InputStreamReader ir = new InputStreamReader(System.in);
             BufferedReader in = new BufferedReader(ir)) {
            command = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
