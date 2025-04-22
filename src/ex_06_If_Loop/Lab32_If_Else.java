package ex_06_If_Loop;

import java.util.Scanner;

public class Lab32_If_Else {

    public static void main(String[] args) {

//        int age = 35;
//
////        int age = Integer.parseInt(args[0]);
//
//        if (age < 20)
//        {
//            System.out.println("You are not allowed to go to Goa");
//        }
//        else
//        {
//            System.out.println("You are allowed to go to Goa");
//        }

        //Taking the input using scanner class

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age = scanner.nextInt();
        //System.out.println(age);

        if (age > 18)
        {
            System.out.println("Allowed to Vote!!");

        }
        else {
            System.out.println("Not allowed to Vote!!");
        }

        }
    }

