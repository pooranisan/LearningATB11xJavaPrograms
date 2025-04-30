package ex_15_OOPS_Concept;

import com.sun.tools.attach.AgentInitializationException;

import java.awt.color.ProfileDataException;

public class Task_31st_March_OOPS
    {
        public static void main(String[] args)
        {
            Person p1 = new Person();
            p1.Person_Details("Poorani", "Chandiran", "Female");
            //p1.personal_details();
            double getSalary;
            p1.person();
            boolean Maritalstatus;

        }
}

class Person
{
String Firstname;
    String Lastname;
    int Age;
    String Gender;
    double Mobile_no;
    int Email;
    boolean Maritalstatus;
    double salary;
    String Address;
    String Profile;

    //With Parameters and Without RT

    void Person_Details(String Firstname, String Lastname, String Gender)
    {
        System.out.println("\nFirstname : "+Firstname + "\nLastname : "+Lastname + "\nGender :" +Gender );

    }

    //With Parameters and With RT

    double getSalary(double salary)
    {
        return (salary);
    }

    //Without Parameters and Without RT

    void person()
    {
        System.out.println("Welcome to the world of OOPS Concept");
    }

    //Without Parameters and With RT

    boolean Maritalstatus(boolean Maritalstatus)
    {
        Maritalstatus = true;
        System.out.println("Marital status" + Maritalstatus);
        return true;
    }
}

