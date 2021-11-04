package com.NoCodeNoLife;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        boolean[] booleans = new boolean[15];
        Arrays.fill(booleans, true);
        for (boolean item : booleans) {
            System.out.printf("%b ", item);
        }
        System.out.println();
    }
}
