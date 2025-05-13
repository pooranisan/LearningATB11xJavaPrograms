package ex_27_Exceptions;

import java.util.Scanner;

public class Lab110_trycatch_finally_purpose
{
    public static void main(String[] args)
    {
     Scanner sc = null;
     sc = new Scanner(System.in);
     System.out.println("Enter the value of v :");
     int v = sc.nextInt();
     try
     {
         int b = 10/v;
     }
     catch (ArithmeticException e)
     {
         System.out.println(e.getMessage());
     }
     finally
     {
         sc.close();
         System.out.println("end of program, sc closed");
     }
    }
}
