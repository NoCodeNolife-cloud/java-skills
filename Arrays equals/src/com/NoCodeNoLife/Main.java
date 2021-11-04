package com.NoCodeNoLife;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        boolean[] booleans1 = {true, true, false};
        boolean[] booleans2 = {true, true, false};
        boolean[] booleans3 = {true, true, true};

        System.out.println("booleans1 is euqal to booleans2? " + Arrays.equals(booleans1, booleans2));
        System.out.println("booleans2 is euqal to booleans3? " + Arrays.equals(booleans2, booleans3));
    }
}
