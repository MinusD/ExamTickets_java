package ru.minusd.ticket14;

/*
 * Метод equals(), который принимамет 2 стека и возращает true, если они равны.
 */

import java.util.Stack;

public class ToEquals {
    public static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2) {
        if (stack1.size() != stack2.size()) {
            return false;
        }
        for (int i = 0; i < stack1.size(); i++) {
            if (stack1.get(i) != stack2.get(i)) {
                return false;
            }
        }
        return true;
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
