package com.code;

public class Number {

    int num;

    public Number(int _num){
        num=_num;
    }

    void Print(){
        System.out.println("call the default functor");
        System.out.println(num);
    }
}
