package com.NoCodeNoLife;

import java.io.BufferedInputStream;
import java.io.Console;
import java.io.IOError;
import java.io.IOException;

public class Main {

    public static String readLine() {
        StringBuffer response = new StringBuffer();
        try (BufferedInputStream buff = new BufferedInputStream(System.in)) {
            int in;
            char inChar;
            do {
                in = buff.read();
                inChar = (char) in;
                if ((in != -1) & (in != '\n') & (in != '\r')) {
                    response.append(inChar);
                }
            } while ((in != -1) & (inChar != '\n') & (in != '\r'));
            buff.close();
            return response.toString();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("\nWhat is your name? ");
        String input = Main.readLine();
        System.out.println("\nHello. " + input);
    }
}
