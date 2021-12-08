package ru.mirea.task2.opt3;


public class Book {
    String name;
    int pages;
    String author;

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.name = "Триумфальная арка";
        b1.pages = 639;
        b1.author = "Эрих Мария Ремарк";
        System.out.println("Мы создали класс, описывающий книгу " + b1.name + ". Её написал " + b1.author + ", в ней " + b1.pages + " cтраниц.");
    }
}
