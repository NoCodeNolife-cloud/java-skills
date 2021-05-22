package com.nocodenolife;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("src/com/nocodenolife/file.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(fileInputStream);


            while (scanner.hasNext()) {

                String name = scanner.next();
                int age = scanner.nextInt();
                double money = scanner.nextDouble();
                System.out.print(name + " " + age + " " + money + "\n");
            }

            fileInputStream.close();
        } catch (IOException ignored) {

        }
    }
}
