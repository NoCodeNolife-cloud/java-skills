package com.nocodenolife;

public class Main {

    public static void main(String[] args) {

        Generic<Integer> integerGeneric = new Generic<>(100);

        integerGeneric.showType();
        int k = integerGeneric.getOb();
        System.out.println("k=" + k);

        Generic<String> stringGeneric = new Generic<>("Hello");

        stringGeneric.showType();
        String s = stringGeneric.getOb();
        System.out.println("s=" + s);
    }
}
