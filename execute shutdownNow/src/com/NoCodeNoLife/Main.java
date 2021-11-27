package com.NoCodeNoLife;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new MyRunnable());
        executorService.shutdownNow();// shutdownNow()
        System.out.println("Main run");
    }
}
