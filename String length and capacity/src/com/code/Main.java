package com.code;

public class Main {

    public static void main(String[] args) {
        StringBuilder sbuilder1 = new StringBuilder();
        System.out.println("包含的字符串长度：" + sbuilder1.length());
        System.out.println("字符串缓冲区容量：" + sbuilder1.capacity());

        StringBuilder sbuilder2 = new StringBuilder("Hello");
        System.out.println("包含的字符串长度：" + sbuilder2.length());
        System.out.println("字符串缓冲区容量：" + sbuilder2.capacity());

        StringBuilder sbuilder3 = new StringBuilder();
        for (int i = 0; i < 17 ; ++i) {
            sbuilder3.append(8);
        }
        System.out.println("包含的字符串长度：" + sbuilder3.length());
        System.out.println("字符串缓冲区容量：" + sbuilder3.capacity());
    }
}
