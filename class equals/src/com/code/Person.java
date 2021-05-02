package com.code;

public class Person {

    String name;
    int age;

    public Person(String _name,int _age){

        name=_name;
        age=_age;
    }

    public String toString(){

        return "Person [name="+name+", age="+age+"]";
    }

    public boolean equals(Object _otherObject){

        if(_otherObject instanceof Person){

            Person _otherPerson=(Person)_otherObject;
            return this.age == _otherPerson.age;
        }

        return false;
    }
}
