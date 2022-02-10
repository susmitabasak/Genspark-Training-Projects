package genspark.projects.Project2.src.main.java;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Hello! What is your name?");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        Random random = new Random();
        boolean guessed = false;
        boolean playAgain  = true;
        while(playAgain) {
            System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20.");
            int secretNumber = random.nextInt(20) + 1;
            // comment line below when playing actually, used for knowing the secret number for verifying
            System.out.println("SECRET NUMBER is " +secretNumber);
            for(int i=0; i<6; i++) {
                guessed = false;
                System.out.println("Take a guess");
                int guess = in.nextInt();
                if (guess < secretNumber)
                    System.out.println("Your guess is too low.");
                else if (guess > secretNumber)
                    System.out.println("Your guess is too high.");
                else if (guess == secretNumber) {
                    System.out.println("Good job, " + name + "! You guessed my number in " + (i+1) + " guesses!");
                    guessed = true;
                    break;
                }
            }
            if(!guessed)
                System.out.println("Sorry, you have exhausted your 6 tries this time...");
            System.out.println("Would you like to play again? (y/n)");
            String play = in.next();
            if(play.equals("y"))
                playAgain = true;
            else if(play.equals("n"))
                playAgain = false;
        }
    }
}
