package Task_April_5th_2025_If_Else;

import java.util.Scanner;

public class Largest_3_Numbers
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter First Number");
            int a = scanner.nextInt();
            System.out.println("Enter Second Number");
            int b = scanner.nextInt();
            System.out.println("Enter Third Number");
            int c = scanner.nextInt();

            if(a>b && a>c)
            {
                System.out.println("A is largest");
            }
            else if (b>c)
            {
                System.out.println("B is largest");
            }
            else
            {
                System.out.println("C is largest");
            }
            scanner.close();

        }

}
