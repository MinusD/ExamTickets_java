package ru.minusd.ticket06;

/*
 * Написать метод guavaSort, который принимает на вход список строк и возвращает отсортированный список строк в порядке возрастания.
 * Алгоритм должен использовать FJC для MultiMap для реализации варианта алгоритма блочной соортировки, который будет
 * работать со строками. Использовать коллекцию FJC дя подсчёта вхождений строк, аналогично тому, как это происходит в
 * блочной сортировке.
 */

import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class ToGuavaSort {


    public static void main(String[] args) {
        String[] arr = {"Farm", "Zoo", "Car", "Apple", "Bee", "Dog", "Golf", "Zoo", "Zoo", "Bee", "Apple"};

        // Тестирование функции
        System.out.println(Arrays.toString(guavaSort(arr)));

    }

    /**
     * Метод guavaSort принимает на вход список строк и возвращает отсортированный список строк в порядке возрастания.
     */
    public static String[] guavaSort(String[] arr) {
        TreeMap<String, Integer> stringCountMap = new TreeMap<String, Integer>(); // Создаём TreeMap для подсчёта вхождений строк
        for (String s : arr) { // Проходим по массиву строк
            if (stringCountMap.containsKey(s)) { // Если строка уже есть в TreeMap, то увеличиваем счётчик на 1
                stringCountMap.put(s, stringCountMap.get(s) + 1);
            } else {
                stringCountMap.put(s, 1); // Если нет, то добавляем строку в TreeMap и устанавливаем счётчик в 1
            }
        }

        TreeSet<String> sortedSet = new TreeSet<String>(stringCountMap.keySet()); // Создаём TreeSet из ключей TreeMap
        String[] sortedArr = new String[arr.length]; // Создаём массив для отсортированных строк
        int i = 0;
        for (String s : sortedSet) {
            for (int j = 0; j < stringCountMap.get(s); j++) {
                sortedArr[i] = s;
                i++;
            }
        }

        return sortedArr;
    }
}
