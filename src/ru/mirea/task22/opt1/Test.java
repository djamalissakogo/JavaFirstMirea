package ru.mirea.task22.opt1;

public class Test {
    public static void main(String[] args) {
        System.out.println("Создадим фабрику, поместим 3 enum (BMW, SAMSUNG, Sber)");
        StocksFactory SF = new StocksFactory();

        System.out.println(SF.createStocks(StocksType.BMW).toString());
        System.out.println(SF.createStocks(StocksType.Samsung).toString());
        System.out.println(SF.createStocks(StocksType.Sber).toString());

    }
}