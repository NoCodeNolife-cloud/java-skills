package com.code;

public class Main {

    public static void main(String[] args) {
        int a = 12;
        System.out.println("a = "+a);
        int b = -a;
        System.out.println("b = "+b);
        System.out.println("after b = -a, then b = " + b);
        b = a++;
        System.out.println("after b = a++, then b= " + b + ", and a = " + a);
        b = ++a;
        System.out.println("after b = ++a, then b= " + b + ", and a = " + a);
    }
}
+
