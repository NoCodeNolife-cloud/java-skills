package com.code;

public class Main {

    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String("Hello world");
        String s3 = new String("\u0048\u0065\u006c\u006f\u0020\u0057\u006f\u0072\u006c\u0064");
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        char chars[] = {'a', 'b', 'c', 'd', 'e'};
        String s4 = new String(chars);
        String s5 = new String(chars, 1, 4);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);

        byte bytes[] = {97, 98, 99};
        String s6 = new String(bytes);
        System.out.println("s6 = " + s6);
        System.out.println("s6字符长度 = " + s6.length());

        String s7 = new String("Hello");
        String s8 = new String("Hello");
        String s9 = "Hello";
        String s10 = "Hello";

        System.out.printf("s7 == s8 :%b\n", s7 == s8);
        System.out.printf("s9 == s10 :%b\n", s9 == s10);
        System.out.printf("s7 == s9 :%b\n", s7 == s9);
        System.out.printf("s8 == s9 :%b\n", s8 == s9);
    }
}
