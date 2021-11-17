package ru.mirea.task17.opt2;

import java.util.Random;

public class Question {
    Random rand = new Random();
    Answers ask() {
        int prob = (int) (100 * rand.nextDouble());

        if (prob < 15)
            return Answers.MAYBE; // 15%
        else if (prob < 30)
            return Answers.NO;    // 15%
        else if (prob < 60)
            return Answers.YES;   // 30%
        else if (prob < 75)
            return Answers.DEFINITELY; // 15%
        else if (prob < 98)
            return Answers.SOON;  // 13%
        else if(prob < 50)
            return Answers.PROBABLY;
        else
            return Answers.NEVER; // 2%

    }
}