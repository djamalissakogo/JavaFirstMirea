package ru.mirea.task17.opt1;

public class AskMe {
    static void answer(Answers result){
        switch (result){
            case YES:
                System.out.println("Yes");
                break;
            case NO:
                System.out.println("No");
                break;
            case PROBABLY:
                System.out.println("probably");
                break;
            case NEVER:
                System.out.println("Never");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case DEFINITELY:
                System.out.println("Unambiguously");
                break;
            case SOON:
                System.out.println("Coming soon");
                break;
        }
    }
    public static void main(String[] args){
        Question q = new Question();

        answer(q.ask());
    }
}
