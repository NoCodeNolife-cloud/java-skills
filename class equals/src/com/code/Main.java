package com.code;

public class Main {

    public static void main(String[] args) {

        Person person1=new Person("Tony",20);
        Person person2=new Person("Tom",20);

        System.out.println(person1==person2);
        System.out.println(person1.equals(person2));
    }
}
