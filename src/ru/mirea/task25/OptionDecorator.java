package ru.mirea.task25;


public class OptionDecorator implements Service{
    private Service service;
    private int price;
    private String name;

    public OptionDecorator(Service service, int price, String name) {
        this.service = service;
        this.price = price;
        this.name = name;
    }

    @Override
    public int getPrice() {
        return this.price + service.getPrice();
    }

    @Override
    public String getName() {
        return "Название опции: "+ this.name + ". Название акции: " + service.getName();
    }
}
