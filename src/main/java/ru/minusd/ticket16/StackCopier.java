package ru.minusd.ticket16;


/*
    * Написать метод, который принимает на вход два стека и возвращает стек, в котором содержатся элементы из обоих стеков.
    * В качестве вспомогательной структуры данных можно использовать только одну очередь
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackCopier {
    public static Stack<Integer> copyStack(Stack<Integer> stack) {
        Stack<Integer> result = new Stack<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        while (!stack.isEmpty()) {
            queue.addFirst(stack.pop());
        }
        while (!queue.isEmpty()) {
            int value = queue.remove();
            result.push(value);
            stack.push(value);
        }
        return result;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println(stack);
        Stack<Integer> copy = copyStack(stack);
        System.out.println(stack);
        System.out.println(copy);
    }
}
