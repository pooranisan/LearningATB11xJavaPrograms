package ex_29_CollectionFramework_DSA.LIST;

public class student
    {
        public student (String name, int rollno)
        {
            this.name = name;
            this.rollno = String.valueOf(rollno);
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getRollno()
        {
            return rollno;
        }

        public void setRollno(String rollno)
        {
            this.rollno = rollno;
        }

        private String name;
        private String rollno;

        public void printdetails()
        {
            System.out.println("Student Name : " + this.name);
            System.out.println("Roll No :" + this.rollno);

        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

