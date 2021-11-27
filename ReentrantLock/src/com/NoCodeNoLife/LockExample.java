package com.NoCodeNoLife;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Data: Created in 2021/11/27
 * Description:
 * 使用ReentrantLock锁
 */
public class LockExample {

    private Lock lock=new ReentrantLock();

    public void func(){
        lock.lock();
        try{
            for(int i=0;i<10;i++){
                System.out.print(i+" ");
            }
        }finally {
            lock.unlock();// 确保释放锁，从⽽而避免发生死锁。
        }
    }
}
