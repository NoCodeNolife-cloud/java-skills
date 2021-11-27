package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/26
 * Description:
 * 使用interrupted()函数
 */
class MyThread2 extends Thread {
    @Override
    public void run() {
        while (!interrupted()) {// 循环体没有try-catch检测InterruptedException异常
            System.out.println("run");
        }
        System.out.println("thread end");
    }
}
