package Programs;

public class Task_April_17th2025_PC
    {
        public static void main(String[] args)
        {
            Student1 s = new Student1("Poorani", "Chandiran");
            System.out.println("\n firstname :" + s.first_name);
            System.out.println("\n lastname :" + s.last_name);

        }
}

class Student1
{
    String first_name;
    String last_name;

    Student1 (String first_name, String last_name)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        System.out.println("Calling Parameterized Constructor");
    }
}
