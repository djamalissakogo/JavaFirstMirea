package ru.mirea.task15.opt2;

import java.io.*;

public class MyFile2 {
    public static void main(String[] args){

        try{
            String line;
            File file = new File("HelloMirea.txt");
            if(!file.exists())
                file.createNewFile();
            PrintWriter fw = new PrintWriter(file);
            fw.println("issa");
            fw.println("hello world");
            fw.close();
            BufferedReader br;
            br = new BufferedReader(new FileReader("HelloMirea.txt"));
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }
        catch (IOException e){
            System.out.println("error: "+ e);
        }
    }
}