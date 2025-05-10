package ex_22_Abstraction;

public class Lab84_AB_Cars
    {
        public static void main(String[] args)
        {
            WagonR car = new WagonR();
            car.drive();
        }
}

abstract class Engine
{
    abstract void StartEngine();
    abstract void StopEngine();
   }

   class WagonR extends Engine
   {
       @Override
       void StartEngine()
       {
           System.out.println("Starting the Car!!");
       }
       @Override
       void StopEngine()
       {
           System.out.println("Stopping the Car!!");
       }

       void drive()
       {
           StartEngine();
           StopEngine();
       }
   }