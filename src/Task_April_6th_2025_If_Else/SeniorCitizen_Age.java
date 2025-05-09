package Task_April_6th_2025_If_Else;

import java.util.Scanner;

public class SeniorCitizen_Age
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the age :");
            int age = scanner.nextInt();

            if (age  < 0)
            {
                System.out.println("Invalid input");
            }
            else if (age >= 0 && age <= 12)
            {
                System.out.println("Child");
            }
            else if (age >= 13 && age <= 19)
            {
                System.out.println("Teenager");
            }
            else if (age >= 20 && age <= 64)
            {
                System.out.println("Adult");
            }
            else
            {
                System.out.println("Senior Citizen");
            }
        }
}
