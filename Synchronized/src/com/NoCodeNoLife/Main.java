package com.NoCodeNoLife;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        SynchronizedExample synchronizedExample = new SynchronizedExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(synchronizedExample::func1);
        executorService.execute(synchronizedExample::func1);
    }
}
