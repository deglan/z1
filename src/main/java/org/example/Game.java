package org.example;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void game() {
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = new Random().nextInt(100);
        System.out.println(numberToGuess);
        for (int i = 1; i <= 5; i++) {
            int playerGuess = scanner.nextInt();
            int trialsLeft = 5 - i;


            if (i == 5) {
                System.out.println(Message.NOT_GUESSED.getMessage() + numberToGuess);
                System.out.println(Message.ANSWER.getMessage() + numberToGuess);
            } else if (playerGuess == numberToGuess) {
                System.out.println(Message.GUESSED.getMessage());
                break;
            } else if (numberToGuess > playerGuess) {
                System.out.println(Message.GREATER.getMessage());
            } else {
                System.out.println(Message.LOWER.getMessage());
            }
            if (i < 5) {
                System.out.println(Message.TRIALS.getMessage() + trialsLeft);
            }

        }

    }
}
