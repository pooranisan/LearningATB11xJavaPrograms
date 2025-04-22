package ex_06_If_Loop;

import java.util.Scanner;

public class Task_14th_March_CLI {

    public static void main(String[] args) {

        //Take user input -> Name, Age and Salary and print it

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = scanner.next();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();

        System.out.println("\n Display User Details");
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Salary :" + salary);

        scanner.close();

    }
}
