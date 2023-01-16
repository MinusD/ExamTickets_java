package ru.minusd.ticket21;

public class Searcher {
    public static int search(Comparable[] array, Object obj) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(obj) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Comparable[] array = new Comparable[3];
        array[0] = new Cat("Murzik");
        array[1] = new Cat("Barsik");
        array[2] = new Cat("Vaska");

        System.out.println(search(array, new Cat("Murzik")));
        System.out.println(search(array, new Cat("Barsik")));
        System.out.println(search(array, new Cat("Vaska")));
        System.out.println(search(array, new Cat("Tom")));
    }
}
