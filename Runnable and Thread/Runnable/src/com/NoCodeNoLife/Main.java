package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runner("one"));
        Thread thread2 = new Thread(new Runner("two"));
        Thread thread3 = new Thread(new Runner("three"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
