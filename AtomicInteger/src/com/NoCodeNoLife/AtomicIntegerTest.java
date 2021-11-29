package com.NoCodeNoLife;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Data: Created in 2021/11/28
 * Description:
 */
public class AtomicIntegerTest {

    private AtomicInteger cnt = new AtomicInteger();

    public void add() {
        cnt.incrementAndGet();
    }

    public int get() {
        return cnt.get();
    }
}
