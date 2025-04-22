package ex_06_If_Loop;

import java.util.Scanner;

public class Task_14th_March_Triangle_Classifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of side1");
        int side1 = Integer.parseInt(scanner.next()); //inputs

        System.out.println("Enter the value of side2");
        int side2 = Integer.parseInt(scanner.next()); //inputs

        System.out.println("Enter the value of side3");
        int side3 = Integer.parseInt(scanner.next()); //inputs

        //to check the sides form a valid triangle

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
        {

            if (side1 == side2 && side2 == side3) //&& logical AND operator //& bitwise AND operator
            {
                System.out.println("Triangle is equilateral");
            }
            else if (side1 == side2 || side2 == side3 || side1 == side3)
            {
                System.out.println("Triangle is Isosceles");
            }
            else
            {
                System.out.println("Triangle is Scalene");
            }
        }
           else
           {
               System.out.println("The given values do not form a triangle");
           }

           scanner.close();

    }
}
