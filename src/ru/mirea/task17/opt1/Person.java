package ru.mirea.task17.opt1;
public enum Person {
    PERSON1("issa"), PERSON2("djamal"), PERSON3("Nikita");
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}