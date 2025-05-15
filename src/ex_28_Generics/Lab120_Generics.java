package ex_28_Generics;

public class Lab120_Generics
{
    public static void main(String[] args)
    {
        temp_sum(3,4);
//        temp_sum(3.14,4.55);

        System.out.println(temp_sum(3,4));

    }

//    static int temp_sum(int a, int b)
//    {
//        return a+b;
//    }
//    static double temp_sum(double a, double b)
//    {
//        return a+b;
//    }
    static <T> T temp_sum(T a, T b)
    {
        System.out.println(a);
        System.out.println(b);
        return null;


    }
}
