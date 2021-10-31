package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        Threader threader1 = new Threader("one");
        Threader threader2 = new Threader("two");
        Threader threader3 = new Threader("three");

        threader1.start();
        threader2.start();
        threader3.start();
    }
}
