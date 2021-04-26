package com.code;

public class Main {

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < number.length; ++i) {
            if (i == 3) {
                continue;
            }
            System.out.println("number order " + i + " is " + number[i]);
        }
    }
}
