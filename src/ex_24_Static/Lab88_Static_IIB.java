package ex_24_Static;

public class Lab88_Static_IIB
{
    public static void main(String[] args)
    {
        P a = new P();
        P a1 = new P();
        P a2 = new P();

    }
}

    class P
    {
       static
        {
            System.out.println("SIB");
        }
        {
            System.out.println("IIB");
        }

        P()
        {
            System.out.println("IIB");
            System.out.println("DC");
        }

    }


