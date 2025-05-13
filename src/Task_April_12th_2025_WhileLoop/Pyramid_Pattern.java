package Task_April_12th_2025_WhileLoop;

import java.util.Scanner;

public class Pyramid_Pattern
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int n = scanner.nextInt();

            int i = 1;

            while (i <=n)
            {
                int a = 1;

                while (a <= n - i)
                {
                    System.out.print(" ");
                    a++;
                }

                int b = 1;

                while (b <= (2 * i - 1))
                {
                    System.out.print("*");
                    b++;
                }
                System.out.println();
                i++;
            }
            scanner.close();
        }
}
