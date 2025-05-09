package Task_April_5th_2025_If_Else;

import java.util.Scanner;

public class Smallest_2_Numbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = scanner.nextInt();
        System.out.println("Enter Second Number");
        int b = scanner.nextInt();

        if (a < b)
        {
            System.out.println("A is Smallest");
        } else
        {
            System.out.println("B is Smallest");
        }
        scanner.close();

    }
}



