package ex_29_CollectionFramework_DSA.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab136_Comparable
    {
        public static void main(String[] args)
        {
            Student s1 = new Student(101, "Poorani", 25);
            Student s2 = new Student(104, "Mythili", 21);
            Student s3 = new Student(107, "Shobana", 27);

            List<Student> studentList = new ArrayList();
            studentList.add(s1);
            studentList.add(s2);
            studentList.add(s3);

            Collections.sort(studentList);
            System.out.println(studentList);

        }

        static class Student implements Comparable <Student>
        {
            private int rollno;
            private String name;
            private int age;

            public Student (int rollno, String name, int age)
            {
                this.rollno = rollno;
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString()
            {
                return "student{" +
                        "rollno=" + rollno +
                        ", name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
            @Override
//            public int compareTo(Student o)
//            {
//                return this.rollno - o.rollno;
//            }

//            public int compareTo(Student o)
//            {
//                return Integer.compare(this.age,o.age);
//
//            }

            public int compareTo(Student o)
            {
                return this.name.compareTo(o.name);
            }

        }
}


