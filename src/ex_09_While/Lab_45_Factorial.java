package ex_09_While;

import java.util.Scanner;

public class Lab_45_Factorial
        {
            public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);
                System.out.println("Welcome to Factorial Program");
                System.out.println("Enter the Factorial Number");
                int number = scanner.nextInt();

                int factorial = 1;
                if(number <=0)  //safe check for factorial
                {
                    System.out.println("Factorial");
                }
                else
                {
                    for (int i = 1; i<=number; i++)
                    {
                        factorial = factorial*i;

                    }
                }

                System.out.println("Factorial is :" + factorial);


            }
}
