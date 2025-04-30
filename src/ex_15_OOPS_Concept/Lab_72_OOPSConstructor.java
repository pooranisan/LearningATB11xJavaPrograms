package ex_15_OOPS_Concept;

public class Lab_72_OOPSConstructor
    {
        public static void main(String[] args)
        {
            Baby b1 = new Baby();
            new Baby();


        }

}

class Baby {
    //Attribute

    String name;

//Behaviour
    void cry()
    {
        System.out.println("Cry!!");
    }

    void sleep()
    {
        System.out.println("Sleep");
    }
    void Eat()
    {
        System.out.println("Eat");
    }

    Baby()
    {
        System.out.println("I am a Default Constructor");
    }

}