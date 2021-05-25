package com.nocodenolife;

public class Main {

    public static void main(String[] args) {

        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iobj = new Stats<>(inums);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dobj = new Stats<>(dnums);

        dobj.doSomething(iobj);
    }
}
