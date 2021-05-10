package com.code;

public class Main {

    public static void main(String[] args) {

        Thread t2 = new Thread(new Runner(), "lastThread");
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();

        Thread t1 = new Thread(new Runner(),"fistThread");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
    }
}
