package ru.minusd.ticket22;

public class Sorter {
    public static void sort(Comparable [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    Comparable temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Comparable[] array = new Comparable[3];
        array[0] = new Cat("Murzik", 3);
        array[1] = new Cat("Barsik", 2);
        array[2] = new Cat("Vaska", 5);

        Sorter.sort(array);

        for (Comparable sortable : array) {
            System.out.println(sortable);
        }
    }
}
