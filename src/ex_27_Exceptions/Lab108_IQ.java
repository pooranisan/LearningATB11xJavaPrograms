package ex_27_Exceptions;

public class Lab108_IQ
{
    public static void main(String[] args)
    {
        int c = 0;
        int b = 0;
        try
        {
            b = 10 / c; //vulnerable code
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
