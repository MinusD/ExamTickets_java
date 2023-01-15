package ru.minusd.ticket0x;

/*
 * Реализуйте класс LinkedIntList, который представляет собой односвязный список целых чисел.
 * Реализовать метод firstLast, который перемещвает первый элемент списка в конец.
 */

public class LinkedIntList {
    /**
     * Класс ListNode представляет узел односвязного списка
     */
    public static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }


    private ListNode head; // Головной/первый элемент

    /**
     * Метод добавляет элемент в конец односвязного списка
     *
     * @param value
     */
    public void add(int value) {

        // Если в списке нет элементов
        if (head == null) {
            head = new ListNode(value);
            return;
        }

        // Если в списке есть элементы, то нужно найти последний элемент
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        // Когда мы дошли до последнего элемента, current.next == null и мы можем добавить новый элемент
        current.next = new ListNode(value);
    }


    /**
     * Метод перемещает первый элемент списка в конец
     */
    public void firstLast() {
        // Если в списке нет элементов или в списке только один элемент, то ничего делать не нужно
        if (head == null || head.next == null) {
            return;
        }

        // Находим последний элемент
        ListNode last = head;
        while (last.next != null) {
            last = last.next;
        }

        // Перемещаем первый элемент в конец
        last.next = head; // Последний элемент теперь ссылается на первый элемент
        head = head.next; // Теперь новый первый элемент - второй элемент
        last.next.next = null;
    }

    /**
     * Метод выводит элементы односвязного списка в консоль
     */
    public void print() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();
        list.firstLast();
        list.print();
    }


}
