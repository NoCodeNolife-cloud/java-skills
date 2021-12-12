package com.NoCodeNoLife;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        File outputFile = new File("./tar.txt");
        String buffer;
        PrintWriter printWriter = new PrintWriter(outputFile);
        while (scanner.hasNext()) {
            String tmp = scanner.nextLine();
            if (tmp.equals("exit")) {
                break;
            }
            printWriter.write(tmp + "\n");
        }
        printWriter.close();
    }
}
