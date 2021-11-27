package com.NoCodeNoLife;

import java.util.concurrent.FutureTask;

public class Main {

    public static void main(String[] args) throws Exception {

        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(myCallable);
        Thread thread = new Thread(ft);
        thread.start();
        System.out.println(ft.get());
    }
}
