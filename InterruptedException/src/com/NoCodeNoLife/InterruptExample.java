package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/26
 * Description:
 */
public class InterruptExample {

    private static class MyThrtead1 extends Thread {

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                System.out.println("Thread run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new MyThrtead1();
        thread1.start();// thread1线程开始运行
        thread1.interrupt();// 中断thread1线程
        System.out.println("Main run");
    }
}
