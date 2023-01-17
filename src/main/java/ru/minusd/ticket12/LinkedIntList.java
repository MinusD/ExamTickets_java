package ru.minusd.ticket12;

public class LinkedIntList {

    ListNode head;

    public void add(int data) {
        if (head == null) {
            head = new ListNode(data);
        } else {
            ListNode current = head;
            while (current.next != null) current = current.next;
            current.next = new ListNode(data);
        }
    }

    public void insert(int index, int data) {
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }
        int i = 0;
        ListNode current = head;
        while (current.next != null && i != index) {
            current = current.next;
            i++;
        }
        if (i == index) {
            current.next = new ListNode(data, current.next);
        } else {
            throw new IndexOutOfBoundsException();
        }

    }

    public void print() {
        ListNode current = head;
        while (current != null) {
            System.out.printf(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static class ListNode {
        public int data;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int data) {
            this.data = data;
        }

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();

        list.insert(2, 9);
        list.print();

    }
}
