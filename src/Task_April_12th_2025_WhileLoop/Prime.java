package Task_April_12th_2025_WhileLoop;

import java.util.Scanner;

public class Prime
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a Number");

            int number = scanner.nextInt();
            boolean isPrime = true;

            if (number <= 1)
            {
                isPrime = false;
            }
            else
            {
                int i = 2;
                while (i <= Math.sqrt(number))
                {
                    if (number % i == 0)
                    {
                        isPrime = false;
                        break;
                    }
                    i++;
                }
            }
            if (isPrime)
            {
                System.out.println("Entered Number is a prime");
            }
            else
            {
                System.out.println("Entered Number is not prime");
            }
            scanner.close();
        }
}
