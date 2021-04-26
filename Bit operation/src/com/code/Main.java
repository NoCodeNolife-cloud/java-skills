package com.code;

import javax.sound.midi.SysexMessage;

public class Main {

    public static void main(String[] args) {
        byte a = 0B00110010;
        byte b = 0B01011110;

        System.out.println("a | b = " + Integer.toBinaryString(a | b));
        System.out.println("a & b = " + Integer.toBinaryString(a & b));
        System.out.println("a ^ b = " + Integer.toBinaryString(a ^ b));
        System.out.println("~b = " + Integer.toBinaryString(~b));

        System.out.println("a >> 2 = "+Integer.toBinaryString(a>>2));
        System.out.println("a >> 1 = "+Integer.toBinaryString(a>>1));
        System.out.println("a >>> 2 = "+Integer.toBinaryString(a>>>2));
        System.out.println("a << 2 = "+Integer.toBinaryString(a<<2));
        System.out.println("a << 1 = "+Integer.toBinaryString(a<<1));

        int c=-12;
        System.out.println("c = "+Integer.toBinaryString(c));
        System.out.println("c >>> 2 = "+Integer.toBinaryString(c>>>2));
        System.out.println("c >> 2 = "+Integer.toBinaryString(c>>2));
    }
}
