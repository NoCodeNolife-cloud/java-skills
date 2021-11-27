package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/27
 * Description:
 */
public class SynchronizedExample {

    public void func1() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " ");
            }
        }
    }
}
