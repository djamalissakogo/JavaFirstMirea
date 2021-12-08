package ru.mirea.task5.opt2;

public class Korgi extends Dog {
    public Korgi(String color, String size, char gender) {
        super(color,size,gender);
    }
    public void Birka(){
        System.out.println("Цвет:"+super.getColor()+". Размер:"+super.getSize()+". Пол:"+super.getGender());
    }
}
