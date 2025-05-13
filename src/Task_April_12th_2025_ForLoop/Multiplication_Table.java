package Task_April_12th_2025_ForLoop;

import java.util.Scanner;

public class Multiplication_Table
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to print multiplication table: ");
            int number = scanner.nextInt();

            for (int i = 1; i <=10; i++)
            {
                System.out.println(number + "*" + i + "=" + (number*i));
            }
            scanner.close();
        }
}
