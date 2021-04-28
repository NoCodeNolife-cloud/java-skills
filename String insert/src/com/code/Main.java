package com.code;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("0123456789");
        System.out.println(str);
        System.out.printf("Enter the offset:");
        Scanner input = new Scanner(System.in);
        int offset = input.nextInt();
        if (offset > str.length() || offset < 0) {
            System.out.println("out of range!");
        } else {
            str.insert(offset, "|");
            System.out.println(str);
        }
    }
}
