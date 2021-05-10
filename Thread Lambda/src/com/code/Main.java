package com.code;

public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread((new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; ++i) {
                    System.out.printf("第 %d次执行 - %s\n", i, Thread.currentThread().getName());
                    try {
                        long sleepTime = (long) (1000 * Math.random());
                        Thread.sleep(sleepTime);
                    } catch (InterruptedException ignored) {

                    }
                }
                System.out.println("执行完成！ " + Thread.currentThread().getName());
            }
        }));
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; ++i) {
                System.out.printf("第 %d次执行 - %s\n", i, Thread.currentThread().getName());
                try {
                    long sleepTime = (long) (1000 * Math.random());
                    Thread.sleep(sleepTime);
                } catch (InterruptedException ignored) {

                }
            }
            System.out.println("执行完成！ " + Thread.currentThread().getName());
        }, "MyThread");
        t2.start();
    }
}
