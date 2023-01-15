package ru.minusd.ticket21;

public class Searcher {
    public static int search(Searchable[] array, Object obj) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalTo(obj)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Searchable[] array = new Searchable[3];
        array[0] = new Cat("Murzik");
        array[1] = new Cat("Barsik");
        array[2] = new Cat("Vaska");

        System.out.println(search(array, new Cat("Murzik")));
        System.out.println(search(array, new Cat("Barsik")));
        System.out.println(search(array, new Cat("Vaska")));
        System.out.println(search(array, new Cat("Tom")));
    }
}
