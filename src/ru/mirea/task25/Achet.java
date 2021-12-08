package ru.mirea.task25;

public class Achet implements Service{
    private int price;
    private String name;

    public Achet(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}