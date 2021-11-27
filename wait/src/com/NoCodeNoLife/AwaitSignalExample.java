package com.NoCodeNoLife;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Data: Created in 2021/11/27
 * Description:
 */
public class AwaitSignalExample {

    private Lock lock=new ReentrantLock();

    private Condition condition=lock.newCondition();

    public void before(){
        lock.lock();
        try{
            System.out.println("before");
            condition.signal();
        }finally {
            lock.unlock();
        }
    }

    public void after(){
        lock.lock();
        try{
            condition.await();
            System.out.println("after");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
