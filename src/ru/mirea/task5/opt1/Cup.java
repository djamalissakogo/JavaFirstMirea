package ru.mirea.task5.opt1;

public class Cup extends Dish{public Cup(String color, int weight, int lot) {
    super(color, weight,lot);
}

    public void Model() {
        System.out.println("Цвет:" + super.getColor() + ". Занимаемый вес в коробке:" + super.getWeight() + ". Кол-во:" + super.getLot());
    }
}