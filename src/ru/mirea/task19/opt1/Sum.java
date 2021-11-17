package ru.mirea.task19.opt1;

import java.util.Scanner;

public class Sum {
    public static int Sum(int n) throws Exception {
        int S = 0;
        if(n< 0) throw new Exception("число меньше нуля");
        for(int i = 1; i < n; i++){
            S += i;
        }
        return S;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        try{
            Sum(n);
            System.out.println(Sum(n));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}