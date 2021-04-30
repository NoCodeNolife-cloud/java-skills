package com.code;

public class Student extends Person {

    private String school;

    public Student(String _name, int _age, String _school) {

        super(_name, _age);
        school = _school;
    }

    public String toString() {

        StringBuilder str = new StringBuilder("name = ");
        str.append(name).append(", age = ").append(age).append(", school = ").append(school);
        return str.toString();
    }
}
