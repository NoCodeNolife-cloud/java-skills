package com.NoCodeNoLife;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Data: Created in 2021/11/30
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        StackClosedExample stackClosedExample = new StackClosedExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(stackClosedExample::add100);
        executorService.execute(stackClosedExample::add100);
        executorService.shutdown();
    }
}
