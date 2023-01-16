package ru.minusd.ticket01;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrays {
    public static ArrayList<Integer> alternate(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        int size = a.size() + b.size();
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (j < a.size()) {
                result.add(a.get(j));
            }
            if (j < b.size()) {
                result.add(b.get(j));
            }
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9, 10));
        System.out.println(alternate(a, b));
    }
}
