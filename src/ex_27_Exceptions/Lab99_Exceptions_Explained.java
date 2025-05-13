package ex_27_Exceptions;

public class Lab99_Exceptions_Explained
    {
        public static void main(String[] args)
        {
            System.out.println("Starting the program!!");
            String input_user = args[0];
            int a = Integer.parseInt(input_user);
            int output = 100/a;
            System.out.println(output);
            System.out.println("End of the program!!");
        }
}
