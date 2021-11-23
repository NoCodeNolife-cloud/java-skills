package com.NoCodeNoLife;


/**
 * 使用引号声明的字符串都是会直接在字符串常量池中生成的，而 new 出来的 String 对象是放在堆空间中的。
 */
public class Main {

    public static void main(String[] args) {

        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1 == s2); // false
        String s3 = s1.intern();
        String s4 = s2.intern();
        System.out.println(s3 == s4); // true
    }
}
