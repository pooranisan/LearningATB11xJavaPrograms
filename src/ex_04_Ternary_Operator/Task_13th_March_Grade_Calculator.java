package ex_04_Ternary_Operator;

import java.util.Scanner;

public class Task_13th_March_Grade_Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the percentage value");
        int number = scanner.nextInt();

        if ((number >= 90) && (number <= 100)) {
            System.out.println("Grade A");
        }
            else if ((number >= 80) && (number <= 89))
            {
                System.out.println("Grade B");
            }
            else if ((number >= 70) && (number <= 79))
            {
                System.out.println("Grade C");
            }
        else if ((number >= 60) && (number <= 69))
        {
            System.out.println("Grade D");
        }
        else if ((number >=0) && (number <= 59))
        {
            System.out.println("Grade F");
        }
        else System.out.println("Invalid Percentage Entered");

        scanner.close();

    }
}
