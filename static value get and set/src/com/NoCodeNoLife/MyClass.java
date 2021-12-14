package com.NoCodeNoLife;

public class MyClass {

    public static int staticValue = 0;

    public static final int staticFinalValue = 10;

    public MyClass() {
        setStaticValue(getStaticValue() + 1);
    }

    public static int getStaticValue() {
        return staticValue;
    }

    public static void setStaticValue(int staticValue) {
        MyClass.staticValue = staticValue;
    }
}
