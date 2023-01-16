package ru.minusd.ticket07;

/**
 * LinkedIntList - класс, который представляет собой односвязный список целых чисел.
 * Класс содержит внутренний класс ListNode, который представляет собой узел списка.
 * Написать метод removeAll, который удаляет из списка все элементы, которые содержаться в другом списке.
 * Методо должен эффетикто удалять за время lon N, где N - количество элементов в списке.
 */

public class LinkedIntList {
    public ListNode front;

    public LinkedIntList() {
        front = null;
    }

    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    public void removeAll(LinkedIntList list) {
        ListNode current = front;
        ListNode prev = null;
        ListNode current2 = list.front;

        while (current != null && current2 != null) {
            if (current.data == current2.data) {
                if (prev == null) {
                    front = current.next;
                } else {
                    prev.next = current.next;
                }
                current = current.next;
                current2 = current2.next;
            } else if (current.data < current2.data) {
                current = current.next;
                prev = current;
            } else {
                current2 = current2.next;
            }
        }
    }


    public static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public void print() {
        ListNode current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedIntList list1 = new LinkedIntList();
        // 1-3-5-7
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);

        LinkedIntList list2 = new LinkedIntList();
        // 1-2-3-4-5
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);


        list1.print();
        list2.print();
        list1.removeAll(list2);
        list1.print();
        list2.print();
    }
}
