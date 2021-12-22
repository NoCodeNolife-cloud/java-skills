package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {
        MyClass myClass = new MyClass(5);
        MyClass myClass2 = new MyClass(5);
        System.out.println(myClass);
        System.out.println(myClass2);
        System.out.println(myClass.equals(myClass2));
    }
}
