package ex_11_Functions;

public class Lab_53_UD_Part1
        {
            public static void main(String[] args)
            {
                String msg =greet_with_hello_wp_with_RT();
                System.out.println(msg);

                greet_with_details("Poorani", 40,1000);
                greet_with_details("Pooranisree", 41,2000);

//                int sum = sum_of_two_numbers(3,4);
//                int sum1 = sum_of_two_numbers(23,65);
//                int sum2 = sum_of_three_numbers(12, 23, 25);
//                int sum3 = sum_of_three_numbers(789, 456, 123);
//
//                int result = Math.max('a','b');
//                System.out.println(result);

            }
            //1. Without parameters and without return type
            static void wp_wr_greet()
            {
                System.out.println("Hi!!!");
            }
            //2. Without parameters and with return type
            static String greet_with_hello_wp_with_RT()
            {
                System.out.println("Hi");
                return "Hi, you there";

            }
            //3. With parameters and without return type (90% usage)
            static void greet_with_details (String name, int age, double salary)
            {
                System.out.println("\nName :" + name + "\nAge :" + age + "\nSalary :" + salary);
            }

            //4. With parametrs and with return type
            static int sum_of_two_numbers(int a,int b)
            {
                return a + b;
            }
            static int sum_of_three_numbers(int a, int b, int c)
            {
                return a + b + c;
            }




}
