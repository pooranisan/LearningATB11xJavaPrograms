package Task_April_12th_2025_ForLoop;

import java.util.Scanner;

public class Inverted_Pyramid_Pattern
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int n = scanner.nextInt();

            for (int i = n; i >= 1; i--)
            {
                for (int a = 1; a <= n - i; a++)
                {
                    System.out.print(" ");
                }
                for (int b = 1; b <= (2 * i - 1); b++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            scanner.close();
        }
}
