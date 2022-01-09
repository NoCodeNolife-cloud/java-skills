package com.NoCodeNoLife;

public class Main implements Runnable {

    Timer timer = new Timer();

    public static void main(String[] args) {
        Main t = new Main();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }

    public void run() {
        timer.add(Thread.currentThread().getName());
    }
}

class Timer {

    private static int num = 0;

    public static synchronized void add(String name) {
        num++;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {

        }
        System.out.println(name + ":你是第" + num + "使用timer的线程");
    }
}