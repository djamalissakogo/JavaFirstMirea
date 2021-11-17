package ru.mirea.task17.opt2;

public class AskMe {
    static void answer(Answers result){
        switch (result){
            case YES:
                System.out.println("Да");
                break;
            case NO:
                System.out.println("Нет");
                break;
            case PROBABLY:
                System.out.println("Вероятно");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
            case MAYBE:
                System.out.println("Может быть");
                break;
            case DEFINITELY:
                System.out.println("Однозначно");
                break;
            case SOON:
                System.out.println("Скоро");
                break;
        }
    }
    public static void main(String[] args){
        Question q = new Question();


    }
}
