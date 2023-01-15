package ru.minusd.ticket24;

public class INum extends Num {
    private int iNum;

    public INum(int num, int iNum) {
        super(num);
        this.iNum = iNum;
    }

    public int getINum() {
        return iNum;
    }

    public void setINum(int iNum) {
        this.iNum = iNum;
    }

    @Override
    public void print() {
        System.out.println("Num: " + getNum() + ", iNum: " + iNum);
    }
}
