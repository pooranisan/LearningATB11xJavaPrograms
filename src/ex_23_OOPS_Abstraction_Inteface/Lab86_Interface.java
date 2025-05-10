package ex_23_OOPS_Abstraction_Inteface;

public class Lab86_Interface
    {
        public static void main(String[] args)
        {
            Rectangle r1 = new Rectangle();
            r1.getArea(10, 10);
        }
}

interface polygon
{
    void getArea(int length, int breadth);
}

class Rectangle implements polygon
{

    @Override
    public void getArea(int length, int breadth)
    {
        System.out.println("The area of rectangle is " + (length * breadth));
    }
}