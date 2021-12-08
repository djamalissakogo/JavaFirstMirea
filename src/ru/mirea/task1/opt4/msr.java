package ru.mirea.task1.opt4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
class msr {
    public static void main (String[] args){
        System.out.println("Введите кол-во элементов:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Random m=new Random();
        int mas[]=new int[n];
        System.out.println("1)Составим с помощью класса Random()");
        System.out.println("Массив:");
        for (int i=0;i<n;i++){
            mas[i]=m.nextInt(100);
            System.out.print(mas[i]+" ");
        }System.out.println();
        System.out.println("Отсортированный массив:");
        Arrays.sort(mas);
        for(int i = 0; i <  mas.length; i++) {
            System.out.print(mas[i] + " ");
        }System.out.println();
        System.out.println("2)Составим с помощью метода random() класса Math");
        int[] array;
        array = new int[n];
        for (int i = 0; i <array.length ; i++) {
            array[i] = ((int) (Math.random()*100 ));
            System.out.print(array[i]+ " ");
        }System.out.println();
        Arrays.sort(array);
        System.out.println("Отсортированный массив:");
        for(int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}