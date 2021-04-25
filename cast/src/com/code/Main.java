package com.code;

public class Main {

    public static void main(String[] args) {
        int i = 10;
        byte b = (byte) i;
        int i2 = (int) i;
        System.out.println(i2);
        int i3 = (int) b;
        System.out.println(i3);
        float c1 = i / 3;
        System.out.println(c1);
        float c2 = (float) i / 3;
        System.out.println(c2);
        long yourNumber = 6666666666L;
        System.out.println(yourNumber);
        int myNuber = (int) yourNumber;
        System.out.println(myNuber);
    }
}
