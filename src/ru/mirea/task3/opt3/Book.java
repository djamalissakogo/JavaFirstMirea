package ru.mirea.task3.opt3;


public class Book {
    String author, name;
    int year, pages;

    public Book(String author, String name, int year, int pages) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString() {
        return "Книга, написанная " + author +" с названием " + name  + ", опубликованная " + year + ", " + pages + "стр.";
    }
}