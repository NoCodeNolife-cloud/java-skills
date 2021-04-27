package com.code;

public class Main {

    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        // 比较字符串是否是相同的引用
        System.out.println("s1 == s2 : " + (s1 == s2));
        // 比较字符串内容是否相等
        System.out.println("s1.equals(s2) : " + (s1.equals(s2)));
        String s3 = "HELlo";
        // 忽略大小写比较字符串内容是否相等
        System.out.println("s1.equalsIgnoreCase(s3) : " + (s1.equalsIgnoreCase(s3)));
        // 比较大小
        String s4 = "java";
        String s5 = "Swift";
        // 比较字符串大小 s4 > s5
        System.out.println("s4.compareTo(s5) : " + (s4.compareTo(s5)));
        // 忽略大小写比较字符串大小 s4 < s5
        System.out.println("s4.compareToIgnoreCase(s5) : " + (s4.compareToIgnoreCase(s5)));

        // 判断文件夹中文件名
        String[] docFolder = {"java.docx", " JavaBean.docx", "Objecitve-C.xlsx", "Swift.docx "};
        int wordDocCount = 0;
        // 查找文件夹中Word文档个数
        for (String doc : docFolder) {
            // 去的前后空格
            doc = doc.trim();// 比较后缀是否有.docx字符串
            if (doc.endsWith(".docx")) {
                wordDocCount++;
            }
        }
        System.out.println("文件夹中Word文档个数是： " + wordDocCount);
        int javaDocCount = 0;
        // 查找文件夹中Java相关文档个数
        for (String doc : docFolder) {
            // 去的前后空格
            doc = doc.trim();
            // 全部字符转成小写
            doc = doc.toLowerCase();
            // 比较前缀是否有java字符串  if (doc.startsWith("java")) {
            if (doc.startsWith("java")) {
                javaDocCount++;
            }
        }
        System.out.println("文件夹中Java相关文档个数是：" + javaDocCount);
    }
}
