package ru.mirea.task18.opt1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileException {
    public static void main(String[] args){
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        }
    }
}