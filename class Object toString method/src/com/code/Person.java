package com.code;

public class Person {

    String name;
    int age;

    public Person(String _name, int _age) {

        name = _name;
        age = _age;
    }

    public String toString() {

        return "Person [name=" + name + ", age=" + age + "]";
    }
}
