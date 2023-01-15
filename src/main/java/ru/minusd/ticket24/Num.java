package ru.minusd.ticket24;

public class Num {
    private int num;

    public Num(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void print() {
        System.out.println("Num: " + num);
    }
}
