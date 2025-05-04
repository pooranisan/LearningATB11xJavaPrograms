package Task_4th_April_2025;

import java.util.Scanner;

public class Even_Odd
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please Enter a number");

            int number = scanner.nextInt();

            String result = (number % 2 == 0) ? "Even" : "Odd";

            System.out.println(result);

            scanner.close();

        }
}
