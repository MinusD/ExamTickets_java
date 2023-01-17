package ru.minusd.ticket30;

public class PowTwo {
    public static void isPow(int n) {
        if (n == 0) {
            System.out.println("NO");
            return;
        }
        if ((n & (n - 1)) == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        isPow(0);
        isPow(2);
        isPow(7);
        isPow((int) Math.pow(2, 30));
    }

}
