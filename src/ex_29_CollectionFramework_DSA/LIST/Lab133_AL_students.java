package ex_29_CollectionFramework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab133_AL_students
    {
        public static void main(String[] args)
        {
            student s1 = new student ("Poorani", 01);
            student s2 = new student ("Mythili", 02);
            student s3 = new student ("Shobana", 03);

            List mystudents = new ArrayList();
            mystudents.add(s1);
            mystudents.add(s2);
            mystudents.add(s3);

            System.out.println(mystudents);

            s1.printdetails();
            s2.printdetails();
            s3.printdetails();

        }
}
