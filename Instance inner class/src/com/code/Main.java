package com.code;

public class Main {

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.test();

        System.out.println("-------直接访问内部类-------");
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
