package Task_April_4_2025;

import Task_April_4_2025.Task_Encap_ATB;

public class Task_ATB_StudentDetails extends Task_Encap_ATB

{
    private String grade;

    public Task_ATB_StudentDetails(int id, String name, String course, String grade, String staffname, String subject)
        {
        super(id, name, course);
        this.grade = grade;
    }
        public String getGrade()
        {
        return grade;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    @Override
    public void ATB_INFO()
    {
        super.ATB_INFO();
        System.out.println("Grade: " + grade);

    }
}
