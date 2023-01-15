package ru.minusd.ticket06;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.Arrays;

public class ToGuavaSort2 {
    public static String[] guavaSort(String[] array) {
        String[] result = new String[array.length];
        Multiset<String> multiset = HashMultiset.create();
        multiset.addAll(Arrays.asList(array));
        int i = 0;
        for (Multiset.Entry<String> e : multiset.entrySet()) {
            for (int k = 0; k < e.getCount(); k++) {
                result[i] = e.getElement();
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"Farm", "Zoo", "Car", "Apple", "Bee", "Dog", "Golf", "Zoo", "Zoo", "Bee", "Apple"};
        System.out.println(Arrays.toString(guavaSort(arr)));
    }

}
