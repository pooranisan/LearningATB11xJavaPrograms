package ex_24_Static;

public class Lab90_static1
    {
        public static void main(String[] args)
        {
            B.commonToAll();
            B b_ref = new B();
            b_ref.display();
            System.out.println(b_ref.a);

        }

}

class B
{
    static
    {
        System.out.println("SIB, called once, class is loaded");
    }
    int a = 10;
    static int b = 10;

    void display()
    {
        System.out.println("Non static");
    }

    static void commonToAll()
    {
        System.out.println("Static");
    }
}