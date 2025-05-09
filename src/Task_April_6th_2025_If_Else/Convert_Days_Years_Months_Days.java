package Task_April_6th_2025_If_Else;

import java.util.Scanner;

public class Convert_Days_Years_Months_Days
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of days : ");
            int total_days = scanner.nextInt();

            int years = total_days / 365;
            int remainingDays = total_days % 365;

            int months = remainingDays / 30;
            int days = remainingDays % 30;

            System.out.println("Totaldays :" + total_days);
            System.out.println("Years :" + years);
            System.out.println("Months :" + months);
            System.out.println("Days :" + days);

            scanner.close();
        }
}
