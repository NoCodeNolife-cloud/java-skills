package com.NoCodeNoLife;

public class Threader extends Thread {

    static private int num = 0;
    private String name;

    public Threader(String name) {

        this.name = name;
    }

    public void run() {

        while (num < 100) {

            try {

                sleep(50);
                num++;
                System.out.println(name + " " + num);
            } catch (InterruptedException ignore) {

            }
        }
    }
}
