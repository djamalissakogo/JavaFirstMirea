package ru.mirea.task23;
import java.util.Objects;

public class Worker {
    private String post;
    private String name;

    public Worker(String post, String name) {
        this.post = post;
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "post=" + post +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(post, name);
    }

    public static void main (String[] args){
        Worker w1 = new Worker("assistant", "Ivan");
        Worker w2= new Worker("assistant", "Ksenia");
        Worker w3 = new Worker ("assistant", "Ivan");
        System.out.println("Получим хеш-код каждого сотрудника");
        System.out.println(w1.toString());
        System.out.println("Хеш-код сотрудника: "+w1.hashCode());

        System.out.println(w2.toString());
        System.out.println("Хеш-код сотрудника: "+w2.hashCode());

        // также путем сравнения система может доказать, что разные сотрудники зашли в систему
        if (w1.hashCode()==w2.hashCode()){
            System.out.println("Один сотрудник");
        }else
            System.out.println("Разные сотрудники");

        // также путем сравнения система может доказать, что один сотрудник зашёл в систему
        if (w1.hashCode()==w3.hashCode()){
            System.out.println("Один сотрудник");
        }else
            System.out.println("Разные сотрудники");
    }
}