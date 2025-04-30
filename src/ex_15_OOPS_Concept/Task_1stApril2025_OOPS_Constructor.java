package ex_15_OOPS_Concept;

public class Task_1stApril2025_OOPS_Constructor

        {
            public static void main(String[] args)
            {
                PD p1 = new PD();
                PD p2 = new PD("Anand",25,"Coimbatore",1234567890,true);

                System.out.println(p1.name);
                System.out.println(p1.age);
                System.out.println(p1.address);
                System.out.println(p1.phonenumber);
                System.out.println(p1.isMale);


                p1.eat();
                p1.sleep();
                p1.walk();
                p1.Dohomework();
                p1.PrintDetails();

                p2.PrintDetails();
            }
}

class PD
{
    //Attributes / Instances

    String name;
    int age;
    String address;
    long phonenumber;
    boolean isMale;

        //Default Constructor
            PD()
            {
                name = "Ashok";
                age = 20;
                address = "Coimbatore";
                phonenumber = 987654321;
                isMale = true;
            }

            //Parameterized Constructor
    PD(String name_arg, int age, String address_arg, long phonenumber, boolean isMale)
    {
        this.name = name_arg;
        this.age = age;
        this.address = address_arg;
        this.phonenumber = phonenumber;
        this.isMale = isMale;
    }

        void eat()
        {
            System.out.println("Eat Well");
        }

        void sleep()
        {
            System.out.println("Sleep Well");
        }

        void walk()
        {
            System.out.println("Walk Well");
        }

        void Dohomework()
        {
            System.out.println("Do Home Work Properly");
        }

        void PrintDetails()
        {
            System.out.println("\nPrinting the details of a person");
            System.out.println("Name : " + name);
            System.out.println("Age :" + age);
            System.out.println("Address :" + address);
            System.out.println("Phonenumber :" + phonenumber);
            System.out.println("isMale :" + isMale);

        }


}
