package ex_09_While;

import java.util.Random;
import java.util.Scanner;

public class Lab_46_Guessing_Game
        {
            public static void main(String[] args)
            {
                Random random = new Random();
                int numberToGuess = random.nextInt(10)+1;
                //int numberToGuess = random.nextInt(100)+1;

                //System.out.println("numberToGuess");
                Scanner scanner = new Scanner(System.in);
                System.out.println("\nEnter a number");

                int guess;
                int attempts = 0;

                while (true)
                {
                    guess = scanner.nextInt();
                    attempts++;

                    if (guess < numberToGuess)
                    {
                        System.out.println("Too low, Try again");
                    }
                    else if (guess > numberToGuess)
                    {
                        System.out.println("Too high, Try again");
                    }
                    else {
                        System.out.println("Correct! You guessed it in" + attempts + "attempts");
                        break;

                    }

                }

            }

        }


