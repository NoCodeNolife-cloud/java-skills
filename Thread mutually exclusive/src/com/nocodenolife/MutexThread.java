package com.nocodenolife;

public class MutexThread extends Thread {

    private static int count = 0;// 静态变量

    private static boolean flag = true;// 信号量，用于线程间互斥

    public MutexThread(String name) {

        super(name);
    }

    public synchronized void run() {

        try {

            int i;
            for (i = 0; i < 100; ++i) {

                if (!flag) {

                    wait();// 不允许进入临界区，等待
                }
                flag = false;// 修改信号量，防止其他线程进入
                count = count + 1;// 访问共享资源
                flag = true;// 修改信号量，允许其他线程进入
                notifyAll();// 唤醒其他等待的线程
                System.out.println("My name is " + getName() + " count= " + count);
                sleep(10);
            }
        } catch (InterruptedException ignored) {

        }
    }
}
