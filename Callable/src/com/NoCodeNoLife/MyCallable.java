package com.NoCodeNoLife;

import java.util.concurrent.Callable;

/**
 * Data: Created in 2021/11/26
 * Description:与Runnable相比，Callable可以有返回值，返回值通过FutureTask进行封装
 */
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 123;
    }
}
