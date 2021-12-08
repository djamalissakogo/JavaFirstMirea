package ru.mirea.task3.opt1;

public class Circle {
    String color;
    int radius;
    int x,y;

    public Circle(String color, int radius, int x, int y) {
        this.color = color;
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
