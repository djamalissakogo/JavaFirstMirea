package ru.mirea.task30;

public class Task {
    public static void main(String[] args) {
        new User("Антон", "Мавроди", 20,"Краснодар");
        new User("Ваня", "Врубаев", 19,"Санкт-Петербург");
        new User("Саша", "Зорин", 44,"Москва");
        new User("Петя", "Кольев", 33,"Майкоп");
        new User("Олег", "Митин", 41,"Сочи");
        System.out.println("Все пользователи:");
        User.getAllUsers().forEach(System.out::println);
        System.out.println("Кол-во пользователей: " + User.getHowManyUsers());
        System.out.println("Общий возраст пользователей: " + User.getAllAgeUsers());
        System.out.println("Средний возраст пользователей: " + User.getAverageAgeOfAllUsers());
    }
}