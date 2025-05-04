package ex_18_OOPS_Polymorphism;

public class Lab75_example_MO
        {
        public static void main(String[] args)
        {
            MathOperations m1 = new MathOperations();
            int r1 = m1.add(3, 4);
            int r2 = m1.add(3,4,5);
            double r3 = m1.add(3.14,2.76);
            System.out.println(r1);
            System.out.println(r2);
            System.out.println(r3);

        }
}

class MathOperations
{
    int add(int a, int b)
    {
        return a + b;
    }

    int add (int a, int b, int c)
    {
        return a + b + c;
    }

    double add(double a, double b)
    {
        return a + b;
    }
}
