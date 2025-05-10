package ex_21_OOPs_Super;

public class Lab81_OOPS_Super
    {
        public static void main(String[] args)
        {
            car c1 = new car (100);
            c1.display();
        }
}

class Vehicle
{
    public int maxspeed = 180;

    Vehicle()
    {
        System.out.println("Default Constructor");
    }

    Vehicle (int a)
    {
        System.out.println("Param Constructor");
    }

    void message()
    {
        System.out.println("No Return, No Argument");
    }

    void message (int a)
    {
        System.out.println("PC - argument");
    }

    void display()
    {
        System.out.println("Vehicle Parent");
    }

}

class car extends Vehicle
{
    private int maxspeed = 281;

    car()
    {
        super(); //DC of parent
    }

    car(int a)
    {
        super(10); //PC of parent
    }

    @Override
    void display()
    {
        System.out.println(this.maxspeed);

        //parent

        System.out.println(super.maxspeed);
        super.message();
        super.message(20);
        super.display();

        System.out.println("Override");
    }

}