package ru.mirea.task29;

import java.io.Serializable;

public class User implements Serializable {
    private String login;
    private String password;
    private String role;
    private int sum;
    private static final long serialVersionUID = 1L;

    public User(String login, String password, String role, int sum) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", sum=" + sum +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}