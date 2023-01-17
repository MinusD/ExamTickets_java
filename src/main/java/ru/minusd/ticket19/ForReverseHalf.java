package ru.minusd.ticket19;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ForReverseHalf {
    public static Queue<Integer> reverseHalf(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        int size = queue.size();

        // Добавляем в стек элементы с нечётными индексами
        for (int i = 0; i < size; i++) {
            if (i % 2 != 0) {
                stack.push(queue.remove());
            } else {
                queue.add(queue.remove());
            }
        }

        // Добавляем в очередь элементы из стека и из очереди
        for (int i = 0; i < size; i++) {
            if (i % 2 != 0) {
                queue.add(stack.pop());
            } else {
                queue.add(queue.remove());
            }
        }

        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);

        System.out.println(queue);
        System.out.println(reverseHalf(queue));
    }



}
