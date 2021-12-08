package ru.mirea.task1.opt5;

import java.util.Scanner;

public class fm {
    public static void main (String[] args) {
        long result = 1;
        System.out.println("Введите кол-во элементов:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int factor = 2; factor <= n; factor++) {
            result *= factor;
        }
        System.out.println("Факториал числа "+n+" равен "+result);
    }
}