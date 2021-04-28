package com.code;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("0123456789");
        Scanner input = new Scanner(System.in);
        System.out.printf("input start：");
        int start = input.nextInt();
        System.out.printf("input end：");
        int end = input.nextInt();
        if (start >= 0 && start <= str.length() && end >= 0 && end <= str.length() && end >= start) {
            str.delete(start, end);// half-open interval
            System.out.println(str);
        } else {
            System.out.println("out of range!");
        }
    }
}
