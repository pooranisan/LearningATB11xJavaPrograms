package Task_19thApril2025;

public class Inheritance
{
    public static void main(String[] args)
    {
        Bus mybus = new Bus();
        mybus.StartEngine();
        mybus.StartBus();

        Car mycar = new Car();
        mybus.StartEngine();
        mycar.StartCar();
    }
}

//Parent Class

class Vehicle
{
    void StartEngine()
    {
        System.out.println("Engine Started");
    }
}

//Child Class 1

class Bus extends Vehicle
{
    void StartBus()
    {
        System.out.println("Bus Started");
    }
}

//Child Class 2

class Car extends Vehicle
{
    void StartCar()
    {
        System.out.println("Car Started");
    }
}
