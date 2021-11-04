package com.NoCodeNoLife;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Integer[] integers = {9, 1, 8, 2, 4, 7, 3, 6, 0};

        System.out.println("before:");
        for (Integer item : integers) {

            System.out.printf("%d ", item);
        }
        System.out.println();
        Arrays.parallelSort(integers, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println("after:");
        for (Integer item : integers) {

            System.out.printf("%d ", item);
        }
        System.out.println();
    }
}
