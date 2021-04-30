package com.code;

public class Person {

    protected String name;

    protected int age;

    public Person(String _name, int _age) {

        name = _name;
        age = _age;
    }

    public String toString() {

        StringBuilder str = new StringBuilder("name = ");
        str.append(name).append(", age =").append(age);

        return str.toString();
    }
}
