package ex_27_Exceptions;

public class Lab112_Jr_QA_vs_Sr_QA2
{
    public static void main(String[] args)
    {
     //Jr.QA
     try
     {
         String ip = args[0]; //Array bound exception
         int a = Integer.parseInt(ip); //Numberformat
         int b = 100/a; //Arithmetic
         System.out.println(b);
     }
     catch (Exception e)
     {
         System.out.println(e.getMessage());
     }

    }
}
