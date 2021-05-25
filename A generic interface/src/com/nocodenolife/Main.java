package com.nocodenolife;

public class Main {

    public static void main(String[] args) {

        Integer inums[] = {56, 47, 23, 45, 85, 12, 55};
        Character chs[] = {'x', 'w', 'z', 'y', 'b', 'o', 'p'};

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chs);

        System.out.println("Max value in inums: " + iob.max());
        System.out.println("Min value in inums: " + iob.min());

        System.out.println("Max value in chs: " + cob.max());
        System.out.println("Min value in chs: " + cob.min());
    }
}
