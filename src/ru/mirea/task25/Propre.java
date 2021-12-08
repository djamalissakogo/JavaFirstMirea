package ru.mirea.task25;


public class Propre implements Service{
    private int price;
    private String name;

    public Propre(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
