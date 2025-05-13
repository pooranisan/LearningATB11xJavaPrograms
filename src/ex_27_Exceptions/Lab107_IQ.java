package ex_27_Exceptions;

public class Lab107_IQ
    {
        public static void main(String[] args)
        {
            try
            {
                String input_user = args[0];
                int a = Integer.parseInt(input_user);
                int output = 100 / a;
            }
            catch (ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e)
            {
                System.out.println(e.getMessage());
            }
        }


}
