package ru.minusd.ticket14;

/*
 * Метод equals(), который принимамет 2 стека и возращает true, если они равны.
 */

import java.util.Objects;
import java.util.Stack;

public class ToEquals {
    public static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> tmp = new Stack<>();
        if (stack1.size() == stack2.size()) {
            while (!stack1.isEmpty()) {
                if (Objects.equals(stack1.peek(), stack2.peek())) {
                    tmp.push(stack1.pop());
                    stack2.pop();
                } else {
                    while (!tmp.isEmpty()) {
                        stack1.push(tmp.peek());
                        stack2.push(tmp.pop());
                    }
                    return false;
                }
            }
            while (!tmp.isEmpty()) {
                stack1.push(tmp.peek());
                stack2.push(tmp.pop());
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println(equals(stack1, stack2));
    }
}
