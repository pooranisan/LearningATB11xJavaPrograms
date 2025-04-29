package ex_14_Arrays;

import java.util.Scanner;

public class Lab_69_Array_Userinput
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the size of the array in integers only : ");
            int size = scanner.nextInt();
            int []numbers = new int [size];

            for (int i =0; i < numbers.length; i++)
            {
                System.out.println("Enter the numbers only : ");
                numbers[i] = scanner.nextInt();

            }
            System.out.println("===========");

            for(int i = 0; i < numbers.length; i++)
            {
                System.out.println(numbers[i]);
            }

            scanner.close();

        }
}
