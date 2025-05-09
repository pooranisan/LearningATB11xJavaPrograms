package Task_April_4_2025;

public class Task_Inheritance

{
        public static void main(String[] args)
        {
            Task_ATB_StudentDetails students[] = new Task_ATB_StudentDetails[3];
            Task_ATB_StaffDetails staff[] = new Task_ATB_StaffDetails[3];
            Task_WorkDetails WD[] = new Task_WorkDetails[3];

            students[0] = new Task_ATB_StudentDetails(1, "Poorani", "Java", "A+", "ABCD", "C Sharp");
            students[1] = new Task_ATB_StudentDetails(2, "Mythili", "Python", "B", "BCDE", "C ++");
            students[2] = new Task_ATB_StudentDetails(3, "Shobana", "Selenium", "A", "CDEF", "DotNet");

            staff[0] = new Task_ATB_StaffDetails(1, "Poorani", "Java", "ABCD", "C Sharp");
            staff[1] = new Task_ATB_StaffDetails(2, "Mythili", "Python", "BCDE", "C ++");
            staff[2] = new Task_ATB_StaffDetails(3, "Shobana", "Selenium", "CDEF", "DotNet");

            WD[0] = new Task_WorkDetails (1, "Poorani", "Java", "F", "DEFG", "ASP", "Infosys", 10L);
            WD[1] = new Task_WorkDetails (2, "Mythili", "Python", "F", "EFGH", "DSP", "Cognizant", 12L);
            WD[2] = new Task_WorkDetails (3, "Shobana", "Selenium", "F", "FGHI", "BSP", "Adithya", 13L);

            System.out.println("Printing List of Students:");

            System.out.println("Student Details:");

            for(Task_ATB_StudentDetails student : students)
            {
                student.ATB_INFO();
                System.out.println();
            }

            System.out.println("StaffDetails:");

            for(Task_ATB_StaffDetails staffmember : staff)
            {
                staffmember.ATB_INFO();
                System.out.println();
            }

            System.out.println("WorkDetails:");

            for(Task_WorkDetails workmember : WD)
            {
                workmember.ATB_INFO();
                System.out.println();
            }

        }
    }








