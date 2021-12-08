package ru.mirea.task3.opt2;

public class Human {
    String name, head;
    int leg,hand;

    public Human(String name, String head, int leg, int hand) {
        this.name = name;
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getHand() {
        return hand;
    }

    public void setHand(int hand) {
        this.hand = hand;
    }


    public String toString() {
        return "Человек с именем " + name  +
                ", имеющим " + head + " голову, с " + leg +
                " ногами и " + hand +" руками";
    }
}
