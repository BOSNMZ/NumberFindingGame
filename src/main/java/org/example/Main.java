package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = random.nextInt(101);
        int attempts = 5;

        System.out.println("Welcome to the Number Finding Game");
        System.out.println("You have 5 attempts to guess the number between 0 and 100");

        while (attempts > 0) {
            System.out.println("Attempts remaining: " + attempts);
            System.out.println("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == numberToGuess){
                System.out.println("Congratulations, you have guessed the number: " + numberToGuess);
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Try a higher number");
            } else {
                System.out.println("Try a lower number");
            }
            attempts--;
        }

        if (attempts == 0) {
            System.out.println("Game over");
            System.out.println("Correct number was: " + numberToGuess);
        }

        scanner.close();
    }
}
