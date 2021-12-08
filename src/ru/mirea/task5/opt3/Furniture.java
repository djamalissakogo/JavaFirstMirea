package ru.mirea.task5.opt3;
public abstract  class Furniture {
    String color,style;
    int weight;


    public String getColor() {
        return color;
    }

    public String getStyle() {
        return style;
    }

    public int getWeight() {
        return weight;
    }

    public Furniture(String color, String style, int weight) {
        this.color = color;
        this.style = style;
        this.weight = weight;
    }
    public abstract void Model();

    public abstract void FurnitureShop();
}