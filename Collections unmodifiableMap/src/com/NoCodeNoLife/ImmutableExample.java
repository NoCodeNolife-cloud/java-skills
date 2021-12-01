package com.NoCodeNoLife;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Data: Created in 2021/11/29
 * Description:
 */
public class ImmutableExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(map);// can't modify map
        unmodifiableMap.put("a", 1);
    }
}
