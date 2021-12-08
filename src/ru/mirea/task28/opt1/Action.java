package ru.mirea.task28.opt1;

public class Action {
    public String stocks;
    public int price;

    public Action(String stocks, int price) {
        this.stocks = stocks;
        this.price = price;
    }

    public String getStocks() {
        return stocks;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Action{" +
                "stocks='" + stocks + '\'' +
                ", price=" + price +
                '}';
    }
}