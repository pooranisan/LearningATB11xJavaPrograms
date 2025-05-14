package Programs;

public class Task_April_17th2025_ConstructorOverloading
    {
        public static void main(String[] args)
        {
            Student2 s1 = new Student2();
            System.out.println("\nFirst Name: " + s1.first_name);
            System.out.println("\nLast Name: " + s1.last_name);

            Student2 s2 = new Student2("Poorani", "Chandiran");
            System.out.println("\nFirst Name: " + s2.first_name);
            System.out.println("\nLast Name: " + s2.last_name);
        }
}

class Student2
{
    String first_name;
    String last_name;

    Student2()
    {
        first_name = "ABCD";
        last_name = "BCDE";
        System.out.println("Calling Default Constructor");
    }

    Student2(String first_name, String last_name)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        System.out.println("Calling Parameterized Constructor");
    }
}
