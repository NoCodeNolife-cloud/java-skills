package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < 60; i++) {
            Thread.sleep(1000);
            System.out.print(i + " : ");
            System.out.println(System.currentTimeMillis() - startTime + "ms");
        }
    }
}
