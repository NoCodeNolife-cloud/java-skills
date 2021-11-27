package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        MyThread2 interruptExample = new MyThread2();
        interruptExample.start();
        try {
            Thread.sleep(1);
            interruptExample.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end");
    }
}
