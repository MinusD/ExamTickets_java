package ru.minusd.ticket06;

import java.util.*;

public class ToGuavaSort3 {
    public static void main(String[] args) {
        String[] arr = {"Farm", "Zoo", "Car", "Apple", "Bee", "Dog", "Golf", "Zoo", "Zoo", "Bee", "Apple"};
        System.out.println(Arrays.toString(guavaSort(arr)));

    }

    public static String[] guavaSort(String[] arr) {
        TreeMap<String, ArrayList<String>> map = new TreeMap<>();
        for (String elem : arr) {
            if (map.containsKey(elem)) {
                ArrayList<String> tmp = map.get(elem);
                tmp.add(elem);
                map.put(elem, tmp);
            } else {
                map.put(elem, new ArrayList<>(Collections.singletonList(elem)));
            }
        }

        String[] result = new String[arr.length];
        int i = 0;
        for (ArrayList<String> elem : map.values()) {
            for (String str : elem) {
                result[i] = str;
                i++;
            }
        }
        return result;
    }
}
