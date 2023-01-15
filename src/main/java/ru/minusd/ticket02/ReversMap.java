package ru.minusd.ticket02;

/*
 * Метод reverse принимает на вход Map от целых чисел к строкам и возвращает Map, в которой ключи и значения поменяны местами.
 */

import java.util.HashMap;
import java.util.Map;

public class ReversMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        System.out.println(map);
        System.out.println(reverse(map));
    }

    public static Map<String, Integer> reverse(Map<Integer, String> map) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }

}
