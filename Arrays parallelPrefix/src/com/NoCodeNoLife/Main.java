package com.NoCodeNoLife;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{2, 3, 1, 0, 5};
        // [2, 3, 1, 0, 5]
        // [2, 5, 1, 0, 5]
        // [2, 5, 6, 0, 5]
        // [2, 5, 6, 6, 5]
        Arrays.parallelPrefix(array, (left, right) -> {
            System.out.println(Arrays.toString(array));
            return left + right;
        });

        // 输出 [2, 5, 6, 6, 11]
        System.out.println(Arrays.toString(array));

    }
}
