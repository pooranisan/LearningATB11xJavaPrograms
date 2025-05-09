package Task_April_4_2025;

public class Task_WorkDetails extends Task_ATB_StudentDetails {
    private String companyname;
    private double salary;

    public Task_WorkDetails(int id, String name, String course, String grade, String staffname, String subject, String companyname, double salary)
    {
        super(id, name, course, grade, staffname, subject);
        this.companyname = companyname;
        this.salary = salary;

    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void ATB_INFO()
    {
        super.ATB_INFO();
        System.out.println("Company Name: " + companyname);
        System.out.println("salary: ₹" + salary + " LPA");
    }
}
