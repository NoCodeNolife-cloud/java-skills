package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        Integer x = 123;
        Integer y = 123;
        System.out.println(x == y); // false
        Integer z = Integer.valueOf(123);
        Integer k = Integer.valueOf(123);
        System.out.println(z == k); // true

        Integer l = Integer.valueOf("123456");
        System.out.println(l);

        // compare to parseInt
        Integer m = Integer.parseInt("123456");
        System.out.println(m);
    }
}
