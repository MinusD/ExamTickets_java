package ru.minusd.ticket29;

import java.util.LinkedList;

public class StackOnArray<T> {
    private Object[] array; // Массив для хранения элементов
    private int size; // Количество элементов в стеке

    public StackOnArray() {
        array = new Object[10]; // Создаем массив на 10 элементов
    }

    public void push(T element) {
        if (size == array.length) { // Если массив заполнен
            Object[] newArray = new Object[array.length * 2]; // Создаем новый массив в 2 раза больше
            System.arraycopy(array, 0, newArray, 0, array.length); // Копируем в него все элементы
            array = newArray; // Присваиваем ссылку на новый массив
        }
        array[size++] = element; // Добавляем элемент в массив
    }

    public T pop() {
        if (size == 0) { // Если стек пуст
            throw new IndexOutOfBoundsException(); // Выбрасываем исключение
        }
        return (T) array[--size]; // Возвращаем элемент
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        StackOnArray<String> stack = new StackOnArray<>(); // Создаем стек
        stack.push("Hello"); // Добавляем в него элементы
        stack.push("World");
        stack.push("!");

        // Выводим все элементы стека
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.pop());
        }
    }

}
