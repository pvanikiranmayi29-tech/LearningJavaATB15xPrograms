package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {
        //Guess a number from 1 to 100
        //how many guesses it will take to print the number we want

        Random random=new Random(); //this is a utility to store a random number

        int numberToGuess = random.nextInt(100); //bound basically means the maximum value that you want
        //bound is not included
        //System.out.println(numberToGuess);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int guess;
        int attempts = 0;

        while(true)
        {
            if(!scanner.hasNextInt()) //if number is not entered this loop will be executed
            {
                System.out.println("Invalid input");
                scanner.next();
                continue;
            }
            guess = scanner.nextInt();
            attempts++;

            if(guess < numberToGuess)
            {
                System.out.println("Too Low, Try again!!");
            }
            else if (guess > numberToGuess)
            {
                System.out.println("Too High, try again!!");
            }
            else
            {
                System.out.println("Correct!!! You have taken this attempts ->" +attempts);
                break;
            }
        }
    }
}
