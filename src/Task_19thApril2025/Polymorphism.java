package Task_19thApril2025;

public class Polymorphism
{
    public static void main(String[] args)
    {
        Department dept = new Department();

        dept = new Computerscience();
        dept.Listofdepartments();

        dept = new Electronics();
        dept.Listofdepartments();

    }
}

//Base Class

class Department
{
    void Listofdepartments()
    {
        System.out.println("List of Departments");
    }
}

class Computerscience extends Department
{
    @Override
    void Listofdepartments()
    {
        System.out.println("I have joined in Computer Science Department");
    }
}

class Electronics extends Department
{
    @Override
    void Listofdepartments()
    {
        System.out.println("I have joined in Electronics and Communication Engineering Department");
    }
}