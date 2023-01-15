package ru.minusd.ticket07;

/**
 * LinkedIntList - класс, который представляет собой односвязный список целых чисел.
 * Класс содержит внутренний класс ListNode, который представляет собой узел списка.
 * Написать метод removeAll, который удаляет из списка все элементы, которые содержаться в другом списке.
 *
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
        while (current != null) {
            if (list.contains(current.data)) {
                remove(current.data);
            }
            current = current.next;
        }
    }

    public boolean contains(int value) {
        ListNode current = front;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

public void remove(int value) {
        if (front == null) {
            return;
        }
        if (front.data == value) {
            front = front.next;
            return;
        }
        ListNode current = front;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
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


        list1.removeAll(list2);

        ListNode current = list1.front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        current = list2.front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
