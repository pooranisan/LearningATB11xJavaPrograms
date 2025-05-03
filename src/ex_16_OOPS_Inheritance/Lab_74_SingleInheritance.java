package ex_16_OOPS_Inheritance;

public class Lab_74_SingleInheritance

    {
        public static void main(String[] args)
        {
            son s = new son();
            s.house1();
            System.out.println(s.gold1);
            s.house();
            System.out.println(s.gold);
        }
}

class father
{
    int gold = 500;
    void house()
    {
        System.out.println("This is Father's house");
    }
}

class son extends father
{
    int gold1 = 250;
    void house1()
    {
        System.out.println("This is my house");
    }
}
