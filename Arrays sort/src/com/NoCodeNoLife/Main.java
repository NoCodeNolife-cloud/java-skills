package com.NoCodeNoLife;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] integers = {9, 5, 1, 7, 3, 8, 2, 4, 6};
        System.out.println("before");
        for (Integer item : integers) {
            System.out.printf("%d ", item);
        }
        System.out.println();
        Arrays.sort(integers);
        System.out.println("after");
        for (Integer item : integers) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }
}
