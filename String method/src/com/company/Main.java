package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String str = new String("strname");
        String anotherstr1 = new String("strname");
        String anotherstr2 = new String("strnama");
        String anotherstr3 = new String("strnamE");

        // charAt
        System.out.println(str.charAt(3));

        // compareTo
        if (str.compareTo(anotherstr1) == 0) {
            System.out.println("str is equal to anotherstr1");
        }

        if (str.compareTo(anotherstr2) > 0) {
            System.out.println("str is big than anotherstr2");
        }

        if (str.compareToIgnoreCase(anotherstr3) == 0) {
            System.out.println("str is equal to anotherstr3");
        }

        // concat
        System.out.println(str.concat(anotherstr1));

        // copyValueOf
        char[] array = {'c', 'o', 'd', 'e'};
        String res = String.copyValueOf(array);
        System.out.println(res);

        // indexOf
        System.out.println(str.indexOf("r"));
        System.out.println(str.indexOf("rn"));

        // replace
        res= str.replace('r','M');
        System.out.println(res);

        // toLowerCase
        res=res.toLowerCase(Locale.ROOT);
        System.out.println(res);


        // toUpperCase
        res=res.toUpperCase(Locale.ROOT);
        System.out.println(res);

        // trim
        res=" 1321 ";
        System.out.println(res);
        res=res.trim();
        System.out.println(res);

        // substring
        str=str.substring(1,3);
        System.out.println(str);
    }
}
