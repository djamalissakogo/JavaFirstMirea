package ru.mirea.task5.opt3;

public class Sofa extends Furniture {
    public Sofa(String color, String style, int weight) {
        super(color, style,weight);
    }

    public void Model() {
        System.out.println(super.getColor() + " диван в " + super.getStyle() + " стиле. Весом(кг): " + super.getWeight());
    }
    public void FurnitureShop(){
        if (super.getWeight()>5){
            System.out.println("Скидка при покупке 5%!");
        }else{
            System.out.println("Скидка не будет предоставлена. Выберете другую модель");
        }
    }
}
