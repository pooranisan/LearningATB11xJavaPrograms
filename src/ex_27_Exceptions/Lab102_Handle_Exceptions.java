package ex_27_Exceptions;

public class Lab102_Handle_Exceptions
    {
        public static void main(String[] args)
        {
            int a = 0;
            try
            {
                a = 10/0;
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
            System.out.println(a);
        }
}
