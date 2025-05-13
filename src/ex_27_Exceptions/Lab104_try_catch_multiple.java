package ex_27_Exceptions;

public class Lab104_try_catch_multiple
    {
        public static void main(String[] args)
        {
            System.out.println("1");
            try
            {
                int a = 10 / 2;
            }
            catch (ArithmeticException e)
            {
                System.out.println("Are you fool");
            }
            catch (Exception e)
            {
                System.out.println("Are you fool, Divide by zero");
            }
            System.out.println("2");
        }
}
