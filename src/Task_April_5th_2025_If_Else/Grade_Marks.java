package Task_April_5th_2025_If_Else;

import java.util.Scanner;

public class Grade_Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 to 100");
        int number = scanner.nextInt();

        if (number < 0 || number > 100) {
            System.out.println("Entered number is invalid, Please enter valid number");
        } else if (number >= 90 && number <= 100) {
            System.out.println("Grade is A+");
        } else if (number >= 80 && number <= 89) {
            System.out.println("Grade is A");
        } else if (number >= 70 && number <= 79) {
            System.out.println("Grade is B");
        } else if (number >= 60 && number <= 69) {
            System.out.println("Grade is C");
        } else if (number >= 50 && number <= 59) {
            System.out.println("Grade is D");
        } else if (number >= 40 && number <= 49) {
            System.out.println("Grade is E");
        } else {
            System.out.println("Below 40, Fail");
        }
    }
}
