package com.code;

public class Main {

    public static void main(String[] args) {

        // 获取主线程
        // getName()方法获得线程的名字，主线程名是main，由JVM分配。
        Thread mainThread = Thread.currentThread();
        System.out.println("主线程名：" + mainThread.getName());
    }
}
