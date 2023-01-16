package ru.minusd.ticket18;

public class LongestSortedSequence {
    private int [] elementData;
    private int size;

    public LongestSortedSequence(int[] elementData) {
        this.elementData = elementData;
        this.size = elementData.length;
    }

    public int getLongestSortedSequence() {
        int max = 1; // Максимальная длина последовательности
        int current = 1; // Текущая длина последовательности
        for (int i = 1; i < size; i++) { // Проходим по всем элементам массива
            if (elementData[i] > elementData[i - 1]) { // Если текущий элемент больше предыдущего
                current++; // Увеличиваем текущую длину последовательности
            } else {
                max = Math.max(max, current); // Сохраняем максимальную длину последовательности
                current = 1;
            }
        }
        if (current > max) {
            max = current;
        }
        return max;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(elementData[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Рандомный массив
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        LongestSortedSequence longestSortedSequence = new LongestSortedSequence(array);

        // Выводим массив
        longestSortedSequence.print();
        System.out.println(longestSortedSequence.getLongestSortedSequence());

    }
}
