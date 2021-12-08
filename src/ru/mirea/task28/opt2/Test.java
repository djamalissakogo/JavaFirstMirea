package ru.mirea.task28.opt2;

import java.util.HashMap;

public class Test {
    public static void main(String [] args){
        Ecob.Banker banker = new Ecob.Banker();
        Ecob bank = banker.createBank();
        HashMap<String, Ecob.Account> b = new HashMap();

        bank.openAccount("084560","Irina");
        bank.putMoney("084560",15000);
        bank.buyStocks("084560",5000);

    }
}