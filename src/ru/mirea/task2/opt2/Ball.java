package ru.mirea.task2.opt2;

public class Ball {
    String name;
    int size;

    public static void main(String[] args) {
        Ball b1 = new Ball();
        b1.name = "красный";
        b1.size = 10;

        System.out.println("Мы создали класс, описывающий " + b1.name + " мяч, с диаметром " + b1.size);
    }


}
