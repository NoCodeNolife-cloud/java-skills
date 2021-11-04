package com.NoCodeNoLife;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        boolean[] booleans = {true, true, false, false};
        boolean[] copy = Arrays.copyOf(booleans,     2);
        for (boolean item : copy) {
            System.out.printf("%b ", item);
        }
    }
}
