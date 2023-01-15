package ru.minusd.ticket09;

/*
 * Реализуйте класс LinkedIntList, который представляет собой односвязный список целых чисел.
 * Реализовать метод removeDuplicates, который удаляет все дубликаты из списка.
 */

public class LinkedIntList {
    private ListNode head;
    private int size;

    public LinkedIntList() {
        head = null;
        size = 0;
    }

    public static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public void add(int value) {
        if (head == null) {
            head = new ListNode(value);
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(value);
    }

    public void removeDuplicates() {
        if (head == null || head.next == null) {
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

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
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(5);
        list.print();
        list.removeDuplicates();
        list.print();
    }
}
