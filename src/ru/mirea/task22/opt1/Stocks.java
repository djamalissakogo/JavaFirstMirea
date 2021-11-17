package ru.mirea.task22.opt1;

public class Stocks {

    private int i;
    private int cost;
    private String status;

    Stocks(StocksType st) {
        this.i = st.getI();
        this.status = st.getStatus();
        this.cost = st.getCost();
    }

    public int getI() {
        return i;
    }

    public int getCost() {
        return cost;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Stocks{" +
                "i=" + i +
                ", cost=" + cost +
                ", status='" + status + '\'' +
                '}';
    }

}