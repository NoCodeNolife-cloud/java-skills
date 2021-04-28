package com.code;

public class Main {

    public static void main(String[] args) {
        Number c_num=new Number(5);
        // c_num.private_print();  don't have access
        c_num.public_print();// call public method
    }
}
