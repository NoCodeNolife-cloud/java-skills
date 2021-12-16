package com.NoCodeNoLife;

public class MyClass {

    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    protected void finalize() {
        System.out.println("---Class deleted---");
    }
}
