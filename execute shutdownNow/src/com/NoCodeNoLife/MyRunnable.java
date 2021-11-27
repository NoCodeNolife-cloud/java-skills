package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/27
 * Description:
 */
public class MyRunnable implements Runnable{

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
