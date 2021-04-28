package com.code;

public class Main {

    public static void main(String[] args) {
        StringBuilder sbuilder1=new StringBuilder("Hello");
        sbuilder1.append(" ").append("World");
        sbuilder1.append('.');
        System.out.println(sbuilder1);

        StringBuilder sbuilder2=new StringBuilder();
        Object obj=null;
        sbuilder2.append(false).append('\t').append(obj);
        System.out.println(sbuilder2);

        StringBuilder sbuilder3=new StringBuilder();
        for(int i=0;i<10;++i){
            sbuilder3.append(i);
        }
        System.out.println(sbuilder3);
    }
}
