package com.code;

import java.time.temporal.TemporalUnit;

public class Main {

    public static void main(String[] args) {

        // 创建线程t1，参数是一个线程执行对象Runner
        Thread t1 = new Thread(new Runner());
        t1.start();

        // 创建线程t2，参数是一个线程执行对象Runner
        Thread t2 = new Thread(new Runner(), "MyThread");
        t2.start();
    }
}
