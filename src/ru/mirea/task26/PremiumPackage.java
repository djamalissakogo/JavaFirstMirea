package ru.mirea.task26;

public class PremiumPackage implements BalasStrategy{
    @Override
    public void balas() {
        System.out.println("'Акционерная безопасность' предусмотрена, стоимость 1000");
    }
}