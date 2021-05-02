package com.code;

public class Main {

    public static void main(String[] args) {

        Integer objInt = 80;
        Double objDouble = 80.0;

        // 自动拆箱
        double sum = objInt + objDouble;

        Character objChar = 'C';
        Boolean objBoolean = true;
        Float objFloat = 80.0f;

        display(100);
    }

    public static void display(Integer _objInt) {

        System.out.println(_objInt);
    }
}
