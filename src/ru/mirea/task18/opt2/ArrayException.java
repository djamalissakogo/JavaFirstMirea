package ru.mirea.task18.opt2;
import java.util.Random;

public class ArrayException {
    public static void main(String[] args){
        int n = (int) (Math.random()*5);
        int i = (int) (Math.random()*5);
        A(n);
        B(i);
    }
    public static void A(int a){
        int b = 1;
        try{
            b = 15/a;
            System.out.println("b= "+b);
            System.out.println("a= "+a);
        }catch (ArithmeticException e){
            System.out.println("   Деление на ноль");
        }
    }
    public static void B(int i){
        try{
            int[] arr = {2, 3};
            System.out.println("arr"+i+" = "+arr[i]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("индекс вне массива");
        }

    }

}
