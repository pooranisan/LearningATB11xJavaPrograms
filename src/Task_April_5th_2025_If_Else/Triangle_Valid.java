package Task_April_5th_2025_If_Else;

import java.util.Scanner;

public class Triangle_Valid
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a Number for side a");
            int a = scanner.nextInt();

            System.out.println("Enter a Number for side b");
            int b = scanner.nextInt();

            System.out.println("Enter a Number for side c");
            int c = scanner.nextInt();

            if (a+b>c && b+c>a && a+c>b)
            {
                System.out.println("The triangle is valid");
            }
            else
            {
                System.out.println("The triangle is invalid");
            }
            scanner.close();

        }
}
