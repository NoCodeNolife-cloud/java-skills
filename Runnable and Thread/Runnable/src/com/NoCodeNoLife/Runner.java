package com.NoCodeNoLife;

public class Runner implements Runnable {

    static private int num = 0;
    private String name;

    public Runner(String name) {

        this.name = name;
    }

    @Override
    public void run() {

        while (num < 100) {

            try {

                Thread.sleep(50);
                num++;
                System.out.println(name + " " + num);
            } catch (InterruptedException ignore) {

            }
        }
    }
}
