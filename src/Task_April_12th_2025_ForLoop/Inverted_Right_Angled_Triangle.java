package Task_April_12th_2025_ForLoop;

import java.util.Scanner;

public class Inverted_Right_Angled_Triangle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");

        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
