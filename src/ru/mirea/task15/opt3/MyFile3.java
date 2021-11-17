package ru.mirea.task15.opt3;
import java.io.*;
import java.util.Scanner;

public class MyFile3 {
    public static void main(String[] args){

        try{
            String line;
            String s;
            String line1;
            String str = "";
            Scanner scanner = new Scanner(System.in);
            File file = new File("HelloMirea.txt");
            if(!file.exists())
                file.createNewFile();
            PrintWriter fw = new PrintWriter(file);
            fw.println("issa");
            fw.println("hello world");
            fw.println("how are you");
            line1 = scanner.nextLine();
            BufferedReader br;
            br = new BufferedReader(new FileReader("HelloMirea.txt"));
            while((line = br.readLine()) != null){
                line.replaceAll("issai", line1);
                //System.out.println(line);
            }
            fw.close();
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
            br.close();
        }
        catch (IOException e){
            System.out.println("error: "+ e);
        }
    }
}