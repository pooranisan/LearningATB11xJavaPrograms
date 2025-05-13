package ex_27_Exceptions;

public class Lab117_Throw
{
    public static void main(String[] args)
    {

    }

    static void divideByZero (int a)
    {
        if (a ==0)
        {
            throw new ArithmeticException();
        }
    }
}
