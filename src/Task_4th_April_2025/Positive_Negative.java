package Task_4th_April_2025;

import java.util.Scanner;

public class Positive_Negative
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please Enter a number");

            double number = scanner.nextDouble();

            if(number > 0)
            {
                System.out.println("The number is positive");
            }
            else if (number < 0)
            {
                System.out.println("The number is negative");
            }
            else
            {
                System.out.println("The number is zero");
            }

            scanner.close();
        }
}

