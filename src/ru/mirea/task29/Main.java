package ru.mirea.task29;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<User> userList=new ArrayList<>();

        FileInputStream nFileInputStream = new FileInputStream("usersNum.ser");
        ObjectInputStream nObjectInputStream = new ObjectInputStream(nFileInputStream);
        int n=(Integer)nObjectInputStream.readObject();
        nObjectInputStream.close();

        FileInputStream userFileInputStream=new FileInputStream("users.ser");
        ObjectInputStream userObjectInputStream=new ObjectInputStream(userFileInputStream);
        for(int i=0;i<n;i++)
            userList.add((User)userObjectInputStream.readObject());
        userObjectInputStream.close();

        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Введите данные для создания аккаунта");
            String login,password,role;
            int sum;
            System.out.println("Login:");
            login=sc.next();
            System.out.println("Password:");
            password=sc.next();
            System.out.println("Role:");
            role=sc.next();
            System.out.println("Sum:");
            sum=sc.nextInt();
            User user=new User(login,password,role,sum);
            userList.add(user);
            n++;
            System.out.println("Чтобы закончить ввод пользователей введите 0");
            login=sc.next();
            if(login.equals("0"))
                break;
        }
        FileOutputStream userOutputStream = new FileOutputStream("users.ser");
        ObjectOutputStream userObjectOutputStream = new ObjectOutputStream(userOutputStream);
        for(int i=0;i<n;i++) {
            System.out.println(userList.get(i));
            userObjectOutputStream.writeObject(userList.get(i));
        }
        userObjectOutputStream.close();

        FileOutputStream nOutputStream = new FileOutputStream("usersNum.ser");
        ObjectOutputStream nObjectOutputStream = new ObjectOutputStream(nOutputStream);
        nObjectOutputStream.writeObject(n);
        nObjectOutputStream.close();
    }
}