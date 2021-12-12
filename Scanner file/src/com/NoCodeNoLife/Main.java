package com.NoCodeNoLife;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File inputFile = new File("./resource.txt");
        Scanner scanner = new Scanner(inputFile);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
