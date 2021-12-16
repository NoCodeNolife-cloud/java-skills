package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {
        {
            MyClass myClass1 = new MyClass(25);
            MyClass myClass2 = new MyClass(35);
        }
        // 超出作用域是不会调用finalize方法的
    }
}
