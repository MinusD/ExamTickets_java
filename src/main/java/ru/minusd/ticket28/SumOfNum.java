package ru.minusd.ticket28;

public class SumOfNum {
    public static int sumOfNum(int n) {
        if (n == 0) return 0;
        return n % 10 + sumOfNum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNum(1234));
        System.out.println(sumOfNum(4321));
        System.out.println(sumOfNum(100000));
    }
}
