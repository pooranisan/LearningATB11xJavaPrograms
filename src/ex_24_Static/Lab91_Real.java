package ex_24_Static;

public class Lab91_Real
    {
        public static void main(String[] args)
        {
            System.out.println(ATB.coursename);
            System.out.println(ATB.mentorname);

            ATB.doAssignment();
            ATB.JoinZoomforClass();

            ATB amit = new ATB();
            amit.setName("amit");
            amit.setPhonenumber("1234567890");

            ATB lucky = new ATB();
            amit.setName("lucky");
            amit.setPhonenumber("2345678901");

        }
}

class ATB
{
    static
    {
        System.out.println("Load the class, I will execute");
    }
    {
        System.out.println("IIB - this is called when object is created");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPhonenumber()
    {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber)
    {
        this.phonenumber = phonenumber;
    }

    private String name;
    private String phonenumber;
    static String coursename = "ATB 11X";
    static String mentorname = "Pramod";

    static void doAssignment()
    {
        System.out.println("Do Assignment");
    }

    static void JoinZoomforClass()
    {
        System.out.println("Class Joined!!");
    }

    void HowTheyDoAssignment()
    {
        System.out.println("It is Different");
    }
}
