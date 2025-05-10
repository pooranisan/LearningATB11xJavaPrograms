package ex_22_Abstraction;

public class Lab85_Real
    {
        public static void main(String[] args)
        {
            System.out.println("How Abstraction Works");
//            c1.Employee();
        }
}

abstract class Employee
{
    private String name;
    private String address;
    private int number;

    Employee()
    {
        System.out.println("DC");
    }

    Employee(String name, String address, int number)
    {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    abstract double computepay();

    void mailCheck()
    {
        System.out.println("Mailing a check to" + this.name + " " + this.address + " " + this.number);
    }
}

class c1 extends Employee
{

    @Override
    double computepay()
    {
        return 0;
    }
}