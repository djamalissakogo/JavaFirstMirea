package ru.mirea.task5.opt2;

public abstract class Dog {
    private String color;
    private String size;
    private char gender;

    public String getColor() {return color;}

    public String getSize() {
        return size;
    }

    public char getGender() {
        return gender;
    }

    public Dog(String color, String size, char gender) {
        this.color = color;
        this.size = size;
        this.gender = gender;
    }
    public abstract void Birka();
}
