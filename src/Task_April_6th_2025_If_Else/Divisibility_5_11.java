package Task_April_6th_2025_If_Else;

import java.util.Scanner;

public class Divisibility_5_11
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number :");
            int number = scanner.nextInt();

            if (number % 5 == 0 && number % 11 == 0)
            {
                System.out.println("Number is divisible by 5 and 11");
            }
            else if (number % 5 == 0)
            {
                System.out.println("Number is divisible by 5");
            }
            else if (number % 11 == 0)
            {
                System.out.println("Number is divisible by 11");
            }
            else
            {
                System.out.println("Number is not divisible by both 5 and 11");
            }
            scanner.close();
        }
}
