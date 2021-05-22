package com.nocodenolife;

import java.io.Serializable;
import java.io.SerializablePermission;

public class Student implements Serializable {

    private String name;
    private String ID;
    private int age;
    private String specialty;

    public Student(String name, String ID, int age, String specialty) {

        this.name = name;
        this.ID = ID;
        this.age = age;
        this.specialty = specialty;
    }

    public Student() {

    }

    public String getName(){

        return name;
    }

    public int getAge(){

        return age;
    }

    public String getID(){

        return ID;
    }

    public String getSpecialty(){

        return specialty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", age=" + age +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
