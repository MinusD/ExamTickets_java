package ru.minusd.ticket06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class ToGuavaSort4 {
    public static void main(String[] args) {
        String[] arr = {"Farm", "Zoo", "Car", "Apple", "Bee", "Dog", "Golf", "Zoo", "Zoo", "Bee", "Apple"};
        System.out.println(Arrays.toString(guavaSort(arr)));

    }

    public static String[] guavaSort(String[] arr) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String elem : arr) {
            if (map.containsKey(elem)) {
                map.put(elem, map.get(elem)+1);
            } else {
                map.put(elem, 1);
            }
        }

        String[] result = new String[arr.length];
        int i = 0;
        for (String elem : map.keySet()) {
            for (int j = 0; j < map.get(elem); j++) {
                result[i] = elem;
                i++;
            }
        }
        return result;
    }
}
