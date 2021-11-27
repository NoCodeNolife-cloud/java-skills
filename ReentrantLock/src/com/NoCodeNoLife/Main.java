package com.NoCodeNoLife;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * test for Lock
 */
public class Main {

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(lockExample::func);
        executorService.execute(lockExample::func);
    }
}
