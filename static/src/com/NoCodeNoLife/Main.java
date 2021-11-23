package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        MyClass myClass3 = new MyClass();

        System.out.println("the total MyClass count is " + MyClass.getCount());
    }
}
