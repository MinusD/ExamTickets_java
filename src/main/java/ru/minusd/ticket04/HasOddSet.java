package ru.minusd.ticket04;

/*
 * Метод hasOdd принимает множество целых чисел и возвращает true, если в множестве есть нечетное число.
 * Если в множестве нет нечетных чисел, то метод возвращает false.
 */

import java.util.HashSet;
import java.util.Set;

public class HasOddSet {
    /**
     * Метод hasOdd принимает множество целых чисел и возвращает true, если в множестве есть нечетное число
     * @param set
     * @return true, если в множестве есть нечетное число
     */
    public static boolean hasOdd(Set<Integer> set) {
        for (Integer i : set) {
            if (i % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(4);
        set1.add(6);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(3);
        set2.add(5);

        System.out.println(hasOdd(set1));
        System.out.println(hasOdd(set2));
    }
}
