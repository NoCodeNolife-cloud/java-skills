package com.code;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        com.code.Person c_person = new Person("liangjiawen", date);
        c_person.toString();
    }
}
