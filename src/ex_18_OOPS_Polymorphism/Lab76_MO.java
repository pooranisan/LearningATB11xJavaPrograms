package ex_18_OOPS_Polymorphism;

public class Lab76_MO
{
    public static void main(String[] args)
    {
        home h1 = new home();
        h1.task(3);
        h1.task(1,2);
        h1.task(1,2,3);
    }
}

class home
{
    void task(int a)
    {
        System.out.println(a);
    }

    void task(int a, int b)
    {
        System.out.println(a + b);
    }

    void task(int a, int b, int c)
    {
        System.out.println(a + b + c);
    }
}
