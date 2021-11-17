package ru.mirea.task17.opt1;

public class Main {
    public static void main(String[] args){
        Person person1, person2, person3;
        for(Person person: Person.values()){
            System.out.println(person + " " + person.ordinal());

        }
        person1 = Person.PERSON1;
        person2 = Person.PERSON2;
        person3 = Person.PERSON3;
        if(person1 == person2)
            System.out.println("true");
        else
            System.out.println("false");
        if(person1.equals(person2))
            System.out.println("it is true");
        else
            System.out.println("no, it is not true");
        System.out.println(person3.getName());
        person3.setName("Issa");
        System.out.println(person3.getName());

    }
}
