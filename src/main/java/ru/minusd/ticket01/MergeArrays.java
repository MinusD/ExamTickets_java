package ru.minusd.ticket01;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrays {
    public static ArrayList<Integer> alernate(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        int size = a.size() + b.size();
        for (int i = 0; i < size; i++) {
            if (!a.isEmpty()) {
                result.add(a.remove(0));
            }
            if (!b.isEmpty()) {
                result.add(b.remove(0));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9, 10));
        System.out.println(alernate(a, b));
    }
}
