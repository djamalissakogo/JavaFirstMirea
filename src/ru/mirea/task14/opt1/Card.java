package ru.mirea.task14.opt1;

public class Card {
    private int d;
    public Card(int d){
        this.d = d;
    }

    public void setC(int d) {
        this.d = d;
    }

    public int getD() {
        return d;
    }

    @Override
    public String toString() {
        return "" + d;
    }
}
