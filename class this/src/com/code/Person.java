package com.code;

import java.util.Date;

public class Person {

    private String name;

    private int age;

    private Date birthdate;

    // initialization
    public Person(String name, int age, Date d) {
        this.name = name;
        this.age = age;
        this.birthdate = d;
        System.out.println(this.toString());
    }

    // initialization
    public Person(String name, Date d) {
        this(name, 30, d);
    }

    // override method toString()
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", brithDate=" + birthdate + "]";
    }
}
