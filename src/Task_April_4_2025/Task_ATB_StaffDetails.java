package Task_April_4_2025;

public class Task_ATB_StaffDetails extends Task_Encap_ATB
{
    private String staffname;
    private String subject;

    public Task_ATB_StaffDetails(int id, String name, String course, String staffname, String subject)
    {
        super(id, name, course);
        this.staffname = staffname;
        this.subject = subject;
    }

    public String getStaffname()
    {
        return staffname;
    }

    public void setStaffname(String staffname)
    {
        this.staffname = staffname;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    @Override
    public void ATB_INFO()
    {
        super.ATB_INFO();
        System.out.println("Staffname: " + staffname);
        System.out.println("Subject: " + subject);


    }
}