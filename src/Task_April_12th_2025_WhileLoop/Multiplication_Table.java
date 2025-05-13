package Task_April_12th_2025_WhileLoop;

import java.util.Scanner;

public class Multiplication_Table
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print multiplication table: ");
        int number = scanner.nextInt();

        int i = 1;
        while(i <=10)
        {
            System.out.println(number + "*" + i + "=" + (number*i));
            i++;
        }

    }
}
