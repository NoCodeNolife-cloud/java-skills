package com.code;

public class Main {

    public static void main(String[] args) {

        Boolean obj1 = new Boolean(true);
        Boolean obj2 = new Boolean("true");
        Boolean obj3 = new Boolean("True");
        Boolean obj4 = new Boolean("TRUE");
        Boolean obj5 = new Boolean("false");
        Boolean obj6 = new Boolean("Yes");
        Boolean obj7 = new Boolean("abc");

        boolean b1 = Boolean.parseBoolean("true");
        boolean b2 = Boolean.parseBoolean("True");
        boolean b3 = Boolean.parseBoolean("TRUE");
        boolean b4 = Boolean.parseBoolean("false");
        boolean b5 = Boolean.parseBoolean("Yes");
        boolean b6 = Boolean.parseBoolean("abc");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);
        System.out.println(obj6);
        System.out.println(obj7);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);

    }
}
