package com.NoCodeNoLife;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Boolean[] booleans1 = {true, true, false};
        Boolean[] booleans2 = {true, true, false};
        System.out.println("the booleans1's hash code is " + Arrays.hashCode(booleans1));
        System.out.println("the booleans2's hash code is " + Arrays.hashCode(booleans2));

        Integer[]integers1={1,2,3,4,5,6,7,8,9};
        Integer[]integers2={1,2,3,4,5,6,7,8,9};
        System.out.println("the integers1's hash code is " + Arrays.hashCode(integers1));
        System.out.println("the integers2's hash code is " + Arrays.hashCode(integers2));
    }
}
