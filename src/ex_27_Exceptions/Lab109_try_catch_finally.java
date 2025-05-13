package ex_27_Exceptions;

public class Lab109_try_catch_finally
{
    public static void main(String[] args)
    {
     int a =1;
     int c=0;
        try
        {
            c = 10/2;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("It will always be executed");
        }

    }
}
