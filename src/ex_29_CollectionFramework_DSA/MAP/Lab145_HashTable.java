package ex_29_CollectionFramework_DSA.MAP;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab145_HashTable
{
    public static void main(String[] args)
    {
        Hashtable<Integer,String> ht1 = new Hashtable();
        ht1.put(1, "One"); //Thread safe, synchronized
        ht1.put(1, "One");
        ht1.put(2, "two");
        ht1.put(3, "three");
        System.out.println(ht1);

        HashMap<Integer,String> ht2 = new HashMap();
        ht2.put(1, "one"); //Not thread safe, not synchronized
        ht2.put(2, "two");
        ht2.put(3, "three");
        ht2.put(null,"null");
        System.out.println(ht2);

        System.out.println("----------");

        Enumeration<Integer> e = ht1.keys();

        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }

    }
}
