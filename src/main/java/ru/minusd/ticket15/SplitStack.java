package ru.minusd.ticket15;

/*
 * Метод splitStack, который принимает стек и перемещвет элементы так, что бы в стеке сначала шли отрицательные
 * элементы, а потом положительные. Порядок элементов внутри групп не важен. Можно использовать только одну
 * дополнительную очередь.
 */

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class SplitStack {
    public static void splitStack(Stack<Integer> stack) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        while (!stack.isEmpty()) {
            Integer i = stack.pop();
            if (i < 0) {
                queue.addFirst(i);
            } else {
                queue.addLast(i);
            }
        }
        while (!queue.isEmpty()) {
            stack.push(queue.pop());
        }
    }

    public static void splitStack2(Stack<Integer> stack) {
        Queue<Integer> queue = new ArrayDeque<>();
        int size = stack.size();
        while (!stack.isEmpty()) queue.add(stack.pop());
        for (int i = 0; i < size; i++) {
            if (queue.peek() < 0) {
                stack.push(queue.poll());
            } else {
                queue.add(queue.poll());
            }
        }
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(-2);
        stack.push(3);
        stack.push(-4);
        stack.push(5);
        stack.push(-6);
        stack.push(7);
        stack.push(-8);
        stack.push(9);
        stack.push(-10);
        System.out.println(stack);
        splitStack(stack);
        System.out.println(stack);
    }
}
