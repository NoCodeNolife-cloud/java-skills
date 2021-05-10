package com.code;

public class Main {

    private static int value = 0;

    public static void main(String[] args) {

        System.out.println("主线程 开始...");

        Thread t1 = new Thread(() -> {
            System.out.println("ThreadA 开始...");
            ;
            for (int i = 0; i < 2; ++i) {
                System.out.println("ThreadA 执行...");
                value++;
            }
            System.out.println("ThreadA 结束...");
        }, "ThreadA");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("value = " + value);
        System.out.println("主线程 结束...");
    }
}
