package com.nocodenolife;

public class Main {

    public static void main(String[] args) {

        MutexThread mutexThread1 = new MutexThread("First Thread");
        MutexThread mutexThread2 = new MutexThread("Second Thread");
        MutexThread mutexThread3 = new MutexThread("Third Thread");

        mutexThread1.start();
        mutexThread2.start();
        mutexThread3.start();
    }
}
