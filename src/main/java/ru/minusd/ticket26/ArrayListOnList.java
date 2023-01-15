package ru.minusd.ticket26;

import java.util.List;

public class ArrayListOnList<T> {

    private T [] array;

    public ArrayListOnList() {
        this.array = null;
    }

    public void add(T element) {
        if (array == null) {
            array = (T[]) new Object[1];
            array[0] = element;
        } else {
            T[] newArray = (T[]) new Object[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[array.length] = element;
            array = newArray;
        }
    }

    public T get(int index) {
        return array[index];
    }

    public void remove(int index) {
        T[] newArray = (T[]) new Object[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        array = newArray;
    }

    public int size() {
        return array.length;
    }

    public static void main(String[] args) {

    }



}
