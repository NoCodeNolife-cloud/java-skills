package com.NoCodeNoLife;

public class MyClass {

    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (value == ((MyClass) obj).value) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "value=" + value +
                '}';
    }
}
