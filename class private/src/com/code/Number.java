package com.code;

public class Number {

    private int num;

    public Number(int _num){
        num=_num;
    }

    private void private_print(){
        System.out.println("call private method");
        System.out.println(num);
    }

    public void public_print(){
        System.out.println("call public method");
        private_print();
    }
}
