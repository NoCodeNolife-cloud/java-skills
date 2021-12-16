package com.NoCodeNoLife;

public class MyClass {

    private Integer value;

    {
        System.out.println("---initial value---");
    }

    public MyClass() {

    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    // 初始化块
    // 初始化块的执行顺序是从上到下
    {
        System.out.println("---initial value start--");
        value = 15;
    }
}
