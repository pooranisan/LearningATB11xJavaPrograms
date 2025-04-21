package ex_04_Ternary_Operator;

import java.util.Scanner;

public class Lab_27_TO_Even_Odd {

    public static void main(String[] args) {

        //Check number whether even or odd
        //Create scanner object

        Scanner scanner = new Scanner(System.in); //Below line indicates to take input from user
        System.out.println("Please Enter a number");

        int number = scanner.nextInt();
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);

        scanner.close();
    }


    }

