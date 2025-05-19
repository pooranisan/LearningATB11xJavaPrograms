package ex_29_CollectionFramework_DSA.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab143_Map
{
    public static void main(String[] args)
    {
        Map<String,Object> student1 = new HashMap();
        student1.put("name", "Diwakar");
        student1.put("phone", "9876543210");
        student1.put("address1", "Bangalore");
        student1.put("address2", 123);

        Map<String,Object> student2 = new HashMap();
        student2.put("name", "Lucky");
        student2.put("phone", "9696969696");
        student2.put("address1", "Delhi");
        student2.put("address2", 321);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

    }
}
