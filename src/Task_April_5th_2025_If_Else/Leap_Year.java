package Task_April_5th_2025_If_Else;

import java.util.Scanner;

public class Leap_Year
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Year");

            int year = scanner.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            {
                System.out.println("It is a leap year");
            }
            else
            {
                System.out.println("It is not a leap year");
            }
            scanner.close();
        }
}
