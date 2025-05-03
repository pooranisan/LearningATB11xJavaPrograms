package ex_16_OOPS_Inheritance;

public class Lab74_Hierarchial_Inheritance
{
    public static void main(String[] args)
    {
        child1 ch1 = new child1();
        ch1.home();
        ch1.ch1();
        System.out.println("=========");

        child2 ch2 = new child2();
        ch2.home();
        ch2.ch2();
        System.out.println("===============");

    }
}

class parent
{
    void home()
    {
        System.out.println("This is my Family");
    }
}

class child1 extends parent
        {
            void ch1()
            {
                System.out.println("Child 1");
            }

        }

        class child2 extends parent
        {
            void ch2()
            {
                System.out.println("Child 2");
            }
        }
