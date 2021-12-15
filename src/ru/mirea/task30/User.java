package ru.mirea.task30;


import java.util.*;

public class User {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String city;
    private static Map<Integer, User> allUsers = new HashMap<>();
    private static int countId = 0;

    public int getAge() {
        return age;
    }

    public static int getCountId() {
        return countId;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    public User(String name,String surname, int age,String city) {
        if (name != null && !name.isEmpty() && age > 0){
            this.name = name;
            this.surname=surname;
            this.age = age;
            this.city=city;
            if (!hasUser()) {
                countId++;
                this.id = countId;
                allUsers.put(id, this);
            }
        }
    }

    private boolean hasUser(){
        for (User user : allUsers.values()){
            if (user.equals(this) && user.hashCode() == this.hashCode()){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                "city=" + city +
                ", age=" + age +
                '}';
    }

    public static List<User> getAllUsers(){
        return new ArrayList<>(allUsers.values());
    }


    public static int getHowManyUsers(){
        return allUsers.size();
    }


    public static int getAllAgeUsers(){
        int countAge = 0;
        for (User user : allUsers.values()){
            countAge += user.age;
        }
        return countAge;
    }


    public static int getAverageAgeOfAllUsers(){
        return getAllAgeUsers() / getHowManyUsers();
    }

}