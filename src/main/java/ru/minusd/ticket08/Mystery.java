package ru.minusd.ticket08;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mystery {
    public static void mystery(Map<String, String> map) {
        Map<String, String> result = new TreeMap<String, String>();
        for (String key : map.keySet()) {
            if (key.compareTo(map.get(key)) < 0) {
                result.put(key, map.get(key));
            } else {
                result.put(map.get(key), key);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("two", "deux");
        map.put("five", "cinq");
        map.put("one", "un");
        map.put("three", "trois");
        map.put("four", "quatre");
        mystery(map);
    }
}
