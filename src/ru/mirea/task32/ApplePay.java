package ru.mirea.task32;

public class ApplePay implements MoneyStrategy {
    @Override
    public void paymentKind() {
        System.out.println("Оплата с помощью ApplePay!");
    }
}