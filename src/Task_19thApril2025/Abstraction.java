package Task_19thApril2025;

public class Abstraction
{
    public static void main(String[] args)
    {
        shape mysquare = new square(2);
        System.out.println("Area of square :" + mysquare.CalculateArea());
    }
}

//Abstract class

abstract class shape
{
    abstract double CalculateArea();

}
//Concrete class

class square extends shape
{
    private double side;

    //Constructor

    public square (double side)
    {
        this.side = side;
    }

    //Implementing the abstract method

    @Override

    double CalculateArea()
    {
        return side * side;
    }
}