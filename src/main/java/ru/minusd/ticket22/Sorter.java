package ru.minusd.ticket22;

import ru.minusd.ticket21.Searchable;
import ru.minusd.ticket21.Searcher;

public class Sorter {
    public static void sort(Sortable [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].equalTo(array[j + 1]) > 0) {
                    Sortable temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Sortable[] array = new Sortable[3];
        array[0] = new Cat("Murzik", 3);
        array[1] = new Cat("Barsik", 2);
        array[2] = new Cat("Vaska", 5);

        Sorter.sort(array);

        for (Sortable sortable : array) {
            System.out.println(sortable);
        }
    }
}
