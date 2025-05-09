package Task_April_4_2025;

public class Task_Encap_ATB
    {
        //Encapsulation

        private int id;
        private String name;
        private String course;

        //para constructor

        public Task_Encap_ATB(int id, String name, String course)
        {
            this.id = id;
            this.name = name;
            this.course = course;

        }
        public int getId()
        {
            return id;
        }

        public void setId(int id)
        {
            this.id = id;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getCourse()
        {
            return course;
        }

        public void setCourse(String course)
        {
            this.course = course;
        }

        public void ATB_INFO()
        {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Course: " + course);

        }

    }
