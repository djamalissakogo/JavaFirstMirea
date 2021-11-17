package ru.mirea.task22.opt1;

class StocksFactory {
    public Stocks createStocks(StocksType type){
        Stocks stocks=null;

        switch (type){
            case Apple -> {
                stocks = new Stocks(StocksType.Apple);
                break;
            }
            case Samsung -> {
                stocks = new Stocks(StocksType.Samsung);
                break;
            }
            case Adidas -> {
                stocks = new Stocks(StocksType.Adidas);
                break;
            }
            case BMW ->{
                stocks = new Stocks(StocksType.BMW);
                break;
            }
            case COCACOLA -> {
                stocks = new Stocks(StocksType.COCACOLA);
                break;
            }
            case Columbia -> {
                stocks = new Stocks(StocksType.Columbia);
                break;
            }
            case eHealth -> {
                stocks = new Stocks(StocksType.eHealth);
                break;
            }
            case Ford -> {
                stocks = new Stocks(StocksType.Ford);
                break;
            }
            case Sber -> {
                stocks = new Stocks(StocksType.Sber);
                break;
            }
            case Tinkoff -> {
                stocks = new Stocks(StocksType.Tinkoff);
                break;
            }
        }
        return stocks;
    }
}