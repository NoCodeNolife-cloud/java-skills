package com.nocodenolife;

public class Stats<T extends Number> {

    T[] nums;

    Stats(T[] obj) {

        nums = obj;
    }

    double average() {

        double sum = 0.0;
        for (int i = 0; i < nums.length; ++i) {

            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    void doSomething(Stats <?> ob){

        System.out.println(ob.getClass().getName());
    }
}
