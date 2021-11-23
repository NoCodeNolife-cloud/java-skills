package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/23
 * Description:
 */
public class MyClass {

    private static Integer count=0;

    public MyClass(){
        count++;
    }

    public static Integer getCount(){
        return count;
    }
}
