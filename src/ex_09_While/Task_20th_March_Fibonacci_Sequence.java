package ex_09_While;

import java.util.Scanner;

public class Task_20th_March_Fibonacci_Sequence
        {
            public static void main(String[] args)

            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter how many Fibonacci numbers you want to print: ");
                int n = scanner.nextInt();
                scanner.close();

                int a = 0;
                int b = 1;
                int sum;

                System.out.print("Fibonacci Series: " + a + " " + b + " ");

                for (int i = 2; i < n; i++)
                {
                    sum = a + b;
                    System.out.print(sum + " ");
                    a = b;
                    b = sum;
                }
                scanner.close();
            }
        }



