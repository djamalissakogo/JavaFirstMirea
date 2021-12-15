package ru.mirea.task32;


public class Cash implements MoneyStrategy {
    @Override
    public void paymentKind() {
        System.out.println("Оплата наличными!");
    }
}