package Task_April_12th_2025_WhileLoop;

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

            int i = 1;

            while(i<=number)
            {
                factorial = factorial*i;
                i++;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
            scanner.close();
        }
}
