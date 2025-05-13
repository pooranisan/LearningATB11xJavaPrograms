package ex_27_Exceptions;

public class Lab103_try_catch
    {
        public static void main(String[] args)
        {
            System.out.println("1");
            try
            {
                int a = 10 / 2;
                System.out.println(a);

            } catch (Exception e)
            {
                System.out.println("Are you fool, Divide by zero");
            }
            System.out.println("2");
            }
        }

