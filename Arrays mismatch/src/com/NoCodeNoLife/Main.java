package com.NoCodeNoLife;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Boolean[] booleans1 = {true, true, false, false, true, true, false};
        Boolean[] booleans2 = {true, true, true, false, false, true, false};
        System.out.println("the first index of the difference between boolean1 and boolean2 is " + Arrays.mismatch(booleans1, booleans2));
        System.out.println("the difference between boolean1 and boolean2 in the scope of index 3 and 6 is " + Arrays.mismatch(booleans1, 3, 6, booleans2, 3, 6));
    }
}
