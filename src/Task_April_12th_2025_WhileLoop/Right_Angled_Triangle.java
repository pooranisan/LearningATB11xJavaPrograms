package Task_April_12th_2025_WhileLoop;

import java.util.Scanner;

public class Right_Angled_Triangle
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of rows of the triangle");

            int n = scanner.nextInt();

            int i = 1;

            while (i <= n)
            {
                int j = 1;

                while (j <= i)
                {
                    System.out.print("* ");
                    j++;
                }
                System.out.println();
                i++;
            }
            scanner.close();

        }
}
