package com.NoCodeNoLife;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws Exception {
        final int totalThread = 10;// thread count
        CountDownLatch countDownLatch = new CountDownLatch(totalThread);// new CountDownLatch
        ExecutorService executorService = Executors.newCachedThreadPool();// new ExecutorService
        for (int i = 0; i < totalThread; i++) {// countDown
            executorService.execute(() -> {
                System.out.print("run..");
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();// await
        System.out.println("end");
        executorService.shutdown();
    }
}
