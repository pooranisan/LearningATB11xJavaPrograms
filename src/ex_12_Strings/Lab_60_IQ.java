package ex_12_Strings;

public class Lab_60_IQ
        {
            public static void main(String[] args)
            {
                String s1 = "Hello";
                String s4 = "Hello"; //SCP => 1

                String s2 = new String("Hello");
                String s3 = new String("Hello"); //OA
                String s5 = new String("hello");

                System.out.println(s1 == s3);
                System.out.println(s1 == s2);
                System.out.println(s2 == s3);

                System.out.println(s1 == s4);
                System.out.println(s3 == s5);

                System.out.println(s1.equals(s2)); //True because "equal" function checks the string
                System.out.println(s1.equals(s3));
                System.out.println(s3.equals(s5));

                System.out.println(s3.equalsIgnoreCase(s5));



            }
}
