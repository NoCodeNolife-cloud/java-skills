package com.NoCodeNoLife;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Data: Created in 2021/11/28
 * Description:
 */
public class Main {

    public static void main(String[] args) throws Exception {
        AtomicIntegerTest atomicIntegerTest = new AtomicIntegerTest();
        final int threadSize = 1000;
        final CountDownLatch countDownLatch = new CountDownLatch(threadSize);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < threadSize; i++) {
            executorService.execute(() -> {
                atomicIntegerTest.add();
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
        System.out.println(atomicIntegerTest.get());
    }
}
