package com.NoCodeNoLife;

import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("白晓雪", 24);
        linkedHashMap.put("月宴", 50);
        linkedHashMap.put("血泽", 45);

        LinkedHashMap<String, Integer> linkedHashMap1 = new LinkedHashMap<>();
        linkedHashMap1.put("白晓雪", 24);
        linkedHashMap1.put("月宴", 50);
        linkedHashMap1.put("血泽", 45);

        System.out.println("equals? " + linkedHashMap.equals(linkedHashMap1));
    }
}
