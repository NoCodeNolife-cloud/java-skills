package com.code;

public class Worker extends Person {

    private String factory;

    public Worker(String _name, int _age, String _factory) {

        super(_name, _age);
        factory = _factory;
    }

    public String toString() {

        StringBuilder str = new StringBuilder("name = ");
        str.append(name).append(", age = ").append(age).append(", factory = ").append(factory);

        return str.toString();
    }
}
