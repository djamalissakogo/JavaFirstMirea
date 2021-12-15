package ru.mirea.task32;

public class BankSystemTest {
    private MoneyStrategy moneyStrategy;

    public BankSystemTest(MoneyStrategy moneyStrategy) {
        this.moneyStrategy = moneyStrategy;
    }

    public void pay() {
        System.out.println("Способ оплаты: ");
        moneyStrategy.paymentKind();
    }

    public void setMoneyStrategy(MoneyStrategy moneyStrategy) {
        this.moneyStrategy = moneyStrategy;
    }

    public static void main(String[] args) {
        BankSystemTest op01 = new BankOperation01();
        op01.setMoneyStrategy(new ApplePay());
        op01.pay();
        System.out.println();
        BankSystemTest op02 = new BankOperation02();
        op02.setMoneyStrategy(new Cash());
        op02.pay();
    }
}