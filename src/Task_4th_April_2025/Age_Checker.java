package Task_4th_April_2025;

import java.util.Scanner;

public class Age_Checker
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your age");

            int age = scanner.nextInt();

            if (age > 18)
            {
                System.out.println("Person is eligible to vote");
            }
            else
            {
                System.out.println("Person is not eligible to vote");
            }

            scanner.close();
        }

}
