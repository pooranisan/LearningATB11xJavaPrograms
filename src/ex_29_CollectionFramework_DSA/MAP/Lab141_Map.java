package ex_29_CollectionFramework_DSA.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab141_Map
{
    public static void main(String[] args)
    {
        Map m1 = new HashMap();
        m1.put("name","Abhi");
        m1.put("rollno",1);
        m1.put("phoneno",987654321);
        System.out.println(m1);

        Map m2 = new LinkedHashMap();
        m2.put("name","Poorani");
        m2.put("rollno",1);
        m2.put("phoneno",987654321);
        System.out.println(m2);

        Map m3 = new TreeMap();
        m3.put("firstname","pramod");
        m3.put("lastname","dutta");
        m3.put("rollno",3);
        m3.put("phone",987654321);
        System.out.println(m3);

    }
}
