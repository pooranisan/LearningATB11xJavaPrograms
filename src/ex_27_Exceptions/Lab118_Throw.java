package ex_27_Exceptions;

import java.util.Scanner;

public class Lab118_Throw
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!!");
        int age = sc.nextInt();
        try
        {
            ValidateAge(age);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    private static void ValidateAge(int age) throws Exception
    {
        if (age < 18)
        {
            throw new Exception ("you can't go, else you will be out of the house");
        }
    }
}


