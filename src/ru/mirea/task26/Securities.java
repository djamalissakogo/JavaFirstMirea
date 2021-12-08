package ru.mirea.task26;

public class Securities {
    BalasStrategy balasStrategy;

    public void profit(){
        System.out.println("Можно получить прибыль");
    }

    public void refund(){
        System.out.println("Можно вернуть занятую сумму");
    }

    public void balas(){
        balasStrategy.balas();
    }
}
class Lukoil extends Securities{
    public Lukoil(){
        this.balasStrategy = new PremiumPackage();
    }
}

class Rosneft extends Securities{
    public Rosneft(){
        this.balasStrategy = new PremiumPackage();
    }
}

class  Magnit extends Securities{
    public Magnit(){
        this.balasStrategy = new StandartPackage();
    }
}