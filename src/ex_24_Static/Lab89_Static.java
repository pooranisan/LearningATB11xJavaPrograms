package ex_24_Static;

public class Lab89_Static
    {
        public static void main(String[] args)
        {
            A ref = new A(10);
            ref.displayvalue();
//            System.out.println(ref.b);
//            A.b = 45;
            System.out.println(A.b);
            //Printing the value of b refers to class (static)
            A.b = 45;
            System.out.println("===========");

            A ref1 = new A(20);
            ref1.displayvalue();
//            System.out.println(ref1.b);
            System.out.println(A.b);
        }

}

class A
{
    int a;
    static int b = 20;

    A (int a)
    {
        this.a = a;
    }

    void displayvalue()
    {
        System.out.println(this.a);
    }
}