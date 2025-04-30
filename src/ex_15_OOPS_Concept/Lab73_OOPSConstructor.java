package ex_15_OOPS_Concept;

public class Lab73_OOPSConstructor
    {
        public static void main(String[] args)
        {
            Car c1 = new Car("Maruti", "Breeza", 2022);
            Car c2 = new Car ("Tata", "CRUZZ", 2023);

            //DC
            Car c3 = new Car();
            c3.name = "AAAA";
            System.out.println(c3.name);

            //PC
            c1.display();
            c2.display();

        }
}

class Car
{
    String name;
    long year;
    String model;

//DC

    Car()
    {
        String name;

        }
// Param

    Car(String name_arg, String model_arg, long year_arg)
    {
        this.name = name_arg;
        this.model = model_arg;
        this.year = year_arg;
    }

    void display()
    {
        System.out.println(this.name);
        System.out.println(this.model);
        System.out.println(this.year);

    }
}