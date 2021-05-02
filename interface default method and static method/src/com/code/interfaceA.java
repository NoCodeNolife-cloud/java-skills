package com.code;

public interface interfaceA {

    void methodA();

    String methodB();

    default int methodC(){
        return 0;
    }

    default String methodD(){
        return "这是默认方法...";
    }

    static double methodE(){
        return 0.0;
    }
}
