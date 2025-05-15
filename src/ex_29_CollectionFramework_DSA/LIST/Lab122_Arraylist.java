package ex_29_CollectionFramework_DSA.LIST;

import java.util.List;
import java.util.ArrayList;

public class Lab122_Arraylist
    {
        public static void main(String[] args)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add("Poorani");
            arraylist.add(null);
            arraylist.add("Chandiran");
            arraylist.add("Chandiran");  //duplicates are allowed
            arraylist.add(123);
            System.out.println(arraylist);
            System.out.println(arraylist.size());

            List l = new ArrayList();
            l.add("123");
            l.add("456");
            System.out.println(l);
        }
}

