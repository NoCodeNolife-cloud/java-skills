package com.code;

public class Main {

    public static void main(String[] args) {

        System.out.println(isEquals(1, 5));
        System.out.println(isEquals(1.0, 1.0));
        System.out.println(isEquals("A", "A"));
    }

    public static <T> boolean isEquals(T a, T b) {

        return a.equals(b);
    }
}
