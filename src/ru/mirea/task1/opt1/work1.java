package ru.mirea.task1.opt1;
import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //подключение потоков ввода и вывода
        System.out.print("Length:");
        int size = input.nextInt(); //считываем переменную size
        int array[] = new int[size]; //осздаем массив размеров size
        System.out.print("Elements:");

        for (int j = 0; j < size; j++) { //заполняем  массив
            array[j] = input.nextInt();
        }

        for (int i = 0; i < size; i++) { //выводим массив
            System.out.print(" " + array[i]);
        }
        System.out.println();
        //выводим сумму массива через for
        int sum = 0;
        for (int k = 0; k < array.length; k++) {
            sum = sum + array[k];
        }
        System.out.print("Sum(for):" + sum);
        //выводим сумму массива через while
        System.out.println();
        int l=0,sum1=0;
        while (l< array.length )
        {
            sum1=sum1+array[l];
            l++;
        }
        System.out.print("Sum(while):" + sum1);
        //выводим сумму массива через do while
        System.out.println();
        int r=0,sum2=0;
        do
        {
            sum2=sum2+array[r];
            r++;
        }while (r<array.length);
        System.out.print("Sum(do/while):" + sum1);
    }
}