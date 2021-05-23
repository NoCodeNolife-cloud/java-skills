package com.nocodenolife;

public class MyTread implements Runnable {

    private static int count = 0;

    private final Thread trval;

    public MyTread(String name) {

        trval = new Thread(this, "name");
    }

    public void run() {

        int i;
        for (i = 0; i < 100; ++i) {

            ++count;
            System.out.println("My name is " + trval.getName() + " count= " + count);
            try {

                trval.sleep(10);
            } catch (InterruptedException ignored) {

            }
        }
    }

    public void start() {

        trval.start();
    }
}
