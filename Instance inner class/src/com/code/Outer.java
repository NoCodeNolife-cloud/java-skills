package com.code;

public class Outer {

    private int x = 10;

    private void print() {

        System.out.println("调用外部方法...");
    }

    public void test() {

        Inner inner = new Inner();
        inner.display();
    }

    class Inner {

        private int x = 5;

        void display() {

            System.out.println("外部类成员变量 x = " + Outer.this.x);
            System.out.println("内部类成员变量 x = " + this.x);
            System.out.println("内部类成员变量 x = " + x);

            Outer.this.print();
            print();
        }
    }
}
