package Task_April_12th_2025_WhileLoop;

import java.util.Scanner;

public class Inverted_Right_Angled_Triangle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");

        int n = scanner.nextInt();

        int i = n;
        while (i >= 1)
        {
            int j = 1;
            while (j <= i)
            {
                System.out.print("* ");
                j++;
            }

            System.out.println();
            i--;
        }
        scanner.close();
    }
}

