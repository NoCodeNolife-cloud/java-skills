package com.NoCodeNoLife;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        boolean[] booleans = {true, false, false, true, true, true, false};
        boolean[] target = Arrays.copyOfRange(booleans, 2, 6);
        for (boolean item : target) {
            System.out.println(item);
        }
    }
}
