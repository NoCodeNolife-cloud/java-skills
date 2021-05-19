package com.company;

public class Main {

    public static void main(String[] args) {

        // declare and initialize
        StringBuffer str = new StringBuffer("hello");
        System.out.println(str);

        // insert
        str.insert(0, "say");
        System.out.println(str);

        // append
        str.append("and");
        System.out.println(str);

        // capacity
        System.out.println(str.capacity());

        // charAt
        System.out.println(str.charAt(3));

        // delete
        str.delete(0, 3);
        System.out.println(str);

        // deleteCharAt
        str.deleteCharAt(2);
        System.out.println(str);

        // length
        System.out.println(str.length());

        // replace
        str.replace(0,2,"done");
        System.out.println(str);

        // setCharAt
        str.setCharAt(2,'f');
        System.out.println(str);
    }
}
