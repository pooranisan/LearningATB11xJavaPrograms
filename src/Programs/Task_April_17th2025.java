package Programs;

public class Task_April_17th2025
    {
        public static void main(String[] args)
        {
            Student s = new Student();
            System.out.println("\n firstname :" + s.first_name);
            System.out.println("\n lastname :" + s.last_name);

        }
}

class Student
{
    String first_name;
    String last_name;

    Student()
    {
        first_name = "Poorani";
        last_name = "Chandiran";
        System.out.println("Default Constructor");
    }
}
