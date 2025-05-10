package ex_22_Abstraction;

public class Lab83_Abstract
    {
        public static void main(String[] args)
        {
            child c = new child();
            c.loan50k();
            c.loan25k();

//            Father f1 = new Father(); // not possible
            Father f2 = new child(); // possible because child is getting father object reference

        }

}

abstract class Father
{
    abstract void loan50k();

    void loan25k()
    {
        System.out.println("Given 25k");
    }
}

class child extends Father
{
    @Override
    void loan50k()
    {
        System.out.println("Child will pay the loan");
    }
}