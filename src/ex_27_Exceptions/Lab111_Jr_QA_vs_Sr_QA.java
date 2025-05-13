package ex_27_Exceptions;

public class Lab111_Jr_QA_vs_Sr_QA
{
    public static void main(String[] args)
    {
        String ip = null;
       try
       {
        ip = args[0];
       }
       catch (ArrayIndexOutOfBoundsException e)
       {
           System.out.println(e.getMessage());
       }
       int a = 0;
        try {
            a= Integer.parseInt(ip);
        }
        catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
        int b =0;
        try
        {
            b = 100 /a;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
