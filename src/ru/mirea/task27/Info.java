package ru.mirea.task27;


import java.util.HashMap;
import java.util.Set;

public class Info {
    public static void main(String [] args){
        HashMap<Integer, String> numberAndNames = new HashMap();
        HashMap<Integer, String> numberAndNames1 = new HashMap<>();
        numberAndNames.put(927, "Николаева Татьяна Ивановна");
        numberAndNames.put(765,"Васильев Иван Григорьевич");
        numberAndNames.put(764, "Говорунова Ирина Вадимовна");

        System.out.println(numberAndNames);

        System.out.println("Получим данные номеров ячеек");
        Set<Integer> key = numberAndNames.keySet();
        System.out.println(key);

        numberAndNames1.put(342, "Афанасьева Лариса Игорьевна");
        numberAndNames1.put(677, "Голиков Андрей Андреевич");

        System.out.println("Объединим полученные две базы");
        numberAndNames.putAll(numberAndNames1);
        System.out.println(numberAndNames);


    }
}