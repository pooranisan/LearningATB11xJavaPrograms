package Task_April_12th_2025_ForLoop;

import java.util.Scanner;

public class Factorial
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to Factorial Program");
            System.out.println("Enter the Factorial Number");
            int number = scanner.nextInt();
            int factorial = 1;

            for (int i = 1; i<=number; i++)
            {
                factorial = factorial*i;
            }
            System.out.println("Factorial is :" + factorial);
            scanner.close();

        }
}
