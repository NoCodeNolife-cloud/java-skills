package com.NoCodeNoLife;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /**
         * version 1
         */
        int[] arr = new int[25];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        for (int item : arr) {
            System.out.print(item + " ");
        }

        /**
         * version 2
         */
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 100);
        }
        System.out.println();
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
