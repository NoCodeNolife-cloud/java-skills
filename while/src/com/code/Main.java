package com.code;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        while (i * i < 100000) {
            i++;
        }

        System.out.println("i = " + i);
        System.out.println("i * i = " + (i * i));
    }
}
