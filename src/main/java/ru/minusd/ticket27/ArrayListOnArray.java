package ru.minusd.ticket27;


public class ArrayListOnArray<T> {
    private Object[] array; // Массив для хранения элементов
    private int size; // Количество элементов в списке

    public ArrayListOnArray() {
        array = new Object[10]; // Создаем массив на 10 элементов
    }

    public void add(T element) {
        if (size == array.length) { // Если массив заполнен
            Object[] newArray = new Object[array.length * 2]; // Создаем новый массив в 2 раза больше
            System.arraycopy(array, 0, newArray, 0, array.length); // Копируем в него все элементы
            array = newArray; // Присваиваем ссылку на новый массив
        }
        array[size++] = element; // Добавляем элемент в массив
    }

    public T get(int index) {
        if (index < 0 || index >= size) { // Если индекс выходит за границы массива
            throw new IndexOutOfBoundsException(); // Выбрасываем исключение
        }
        return (T) array[index]; // Возвращаем элемент
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ArrayListOnArray<String> list = new ArrayListOnArray<>(); // Создаем список
        list.add("Hello"); // Добавляем в него элементы
        list.add("World");
        list.add("!");

        // Выводим все элементы списка
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}