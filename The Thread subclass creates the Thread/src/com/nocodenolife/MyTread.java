package com.nocodenolife;

public class MyTread extends Thread {

    private static int count = 0;

    public void run() {

        int i;
        for (i = 0; i < 100; ++i) {// 计数循环

            ++count;
            System.out.println("My name is " + getName() + " count= " + count);

            try{

                sleep(100);// 休眠
            }catch (InterruptedException ignored){

            }
        }
    }

    public MyTread(String name){

        super(name);
    }
}
