package com.code;

public class AB implements InterfaceA, InterfaceB {

    @Override
    public void methodC() {

        System.out.println("Call methodC");
    }

    @Override
    public void methodA() {

        System.out.println("Call methodA");
    }

    @Override
    public void methodB() {

        System.out.println("Call methodB");
    }
}
