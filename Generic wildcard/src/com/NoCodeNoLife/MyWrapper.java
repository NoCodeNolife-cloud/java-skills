package com.NoCodeNoLife;

/**
 * Author: Administrator
 * Date: 22:57
 * Description:
 */
public class MyWrapper extends MyClass {

    public Double doubleValue;

    public MyWrapper(int value, Double doubleValue) {
        super(value);
        this.doubleValue = doubleValue;
    }

    @Override
    public String toString() {
        return "MyWrapper{" +
                "value=" + value +
                ", doubleValue=" + doubleValue +
                '}';
    }
}
