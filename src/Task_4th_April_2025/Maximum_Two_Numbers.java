package Task_4th_April_2025;

import java.util.Scanner;

public class Maximum_Two_Numbers
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the first number");
            int a = scanner.nextInt();

            System.out.println("Enter the second number");
            int b = scanner.nextInt();

            if (a > b)
            {
                System.out.println("A is Maximum");
            }
            else if (a < b)
            {
                System.out.println("B is Maximum");
            }
            else
            {
                System.out.println("A and B are equal");
            }

            scanner.close();
        }
}

