package Task_April_12th_2025_ForLoop;

import java.util.Scanner;

public class Right_Angled_Triangle
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of rows of the triangle");

            int n = scanner.nextInt();

            for (int i =1; i <=n; i++)
            {
                for (int j = 1; j <=i; j++)
                {
                    System.out.print("* ");

                }
                System.out.println();
            }
            scanner.close();
        }
}
