package ru.mirea.task15.opt1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyFile { public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            File file = new File("helloWorld.txt");
            PrintWriter pw = new PrintWriter(file);
            pw.println(scanner.nextLine());
            if(!file.exists())
                file.createNewFile();
            pw.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }


}