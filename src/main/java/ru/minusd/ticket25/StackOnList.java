package ru.minusd.ticket25;

import java.util.ArrayList;
import java.util.List;

public class StackOnList<T> {

    private final List<T> list;

    public StackOnList() {
        this.list = new ArrayList<>();
    }

    public void push(T element) {
        list.add(element);
    }

    public T pop() {
        return list.remove(list.size() - 1);
    }

    public T peek() {
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }

    public static void main(String[] args) {
        StackOnList<Integer> stack = new StackOnList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
