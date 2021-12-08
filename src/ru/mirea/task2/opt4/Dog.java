package ru.mirea.task2.opt4;

public class Dog {
    String name;
    int age;
    int people;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Dog(String n, int a) {
        name = n;
        age = a;
    }

    public int getPeople(){
        return age*7;
    }

    public String toString() {
        return this.name+" cобака, которой "+this.age+", однако человеку в его возрасте было бы "+this.getPeople();
    }
}