package ru.mirea.task24;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {

    public static void main (String[] args) {
        System.out.println("Добро пожаловать в систему. Начнём регистрацию\n Введите логин:");
        int i = 1;
        while (i != 0) {
            Scanner scanner = new Scanner(System.in);
            String login = scanner.nextLine();

            String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(login);

            if (matcher.matches() == true) {

                System.out.println("Задайте пароль:");

                Scanner scanner1 = new Scanner(System.in);
                String password = scanner1.nextLine();

                String regex1 = "[A-Za-z0-9]+";
                Pattern pattern1 = Pattern.compile(regex1);

                Matcher matcher1 = pattern1.matcher(password);

                if (matcher1.matches() == true) {
                    System.out.println("Регистрация завершена");
                    break;
                } else {
                    System.out.println("Вы задали неверный пароль");
                }

            } else {
                System.out.println("Вы задали логин неверно!");
                System.out.println("Повторите операцию регистрации");
                i=0;
            }
        }
    }
}