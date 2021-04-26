package com.code;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; ++i) {
            if (i == 3) {
                break;
            }
            System.out.println("numbers order " + i + " is " + numbers[i]);
        }
    }
}
