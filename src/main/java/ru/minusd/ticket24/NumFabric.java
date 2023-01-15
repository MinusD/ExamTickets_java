package ru.minusd.ticket24;

public class NumFabric {
    public static Num getNum(int num, int iNum) {
        return new INum(num, iNum);
    }

    public static Num getNum(int num) {
        return new Num(num);
    }

    public static void main(String[] args) {
        Num num = getNum(1);
        num.print();
        num = getNum(2, 3);
        num.print();
    }
}
