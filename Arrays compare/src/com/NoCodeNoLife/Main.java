package com.NoCodeNoLife;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        boolean[] booleans1 = {true, true, false, false};
        boolean[] booleans2 = {true, true, false, true};
        int res = Arrays.compare(booleans1, booleans2);
        if (res == 0) {
            System.out.println("booleans1 is equal to booleans2");
        } else if (res > 0) {
            System.out.println("booleans1 is greater to booleans2");
        } else {
            System.out.println("booleans1 is less to booleans2");
        }

        boolean[] booleans3 = {true, true, false, false};
        res = Arrays.compare(booleans1, booleans3);
        if (res == 0) {
            System.out.println("booleans3 is equal to booleans2");
        } else if (res > 0) {
            System.out.println("booleans3 is greater to booleans2");
        } else {
            System.out.println("booleans3 is less to booleans2");
        }
    }
}
