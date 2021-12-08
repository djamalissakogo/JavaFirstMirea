package ru.mirea.task5.opt1;

public abstract class Dish {
    private String color;
    private int lot,weight ;

    public String getColor() {
        return color;
    }

    public int getLot() {
        return lot;
    }

    public int getWeight() {
        return weight;
    }

    public Dish(String color, int lot, int weight) {
        this.color = color;
        this.lot = lot;
        this.weight = weight;
    }

    public abstract void Model();
}
