package ex_29_CollectionFramework_DSA.LIST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab127_LL2
    {
        public static void main(String[] args)
        {
         List mylist = new ArrayList(5);
         List mylist0 = new ArrayList();

         List mylist2 = new LinkedList();

         mylist2.add("Pramod");
         mylist2.add("Dutta");
         mylist2.add("Poorani");
         mylist2.add("Chandiran");
         mylist2.add(null);
         mylist2.add(true);
         mylist2.add(false);
         mylist2.add(234);

            System.out.println(mylist2);
            System.out.println(mylist2.isEmpty());
            System.out.println(mylist2.size());
            System.out.println(mylist2.contains("Pramod"));
            System.out.println(mylist2.indexOf(("Poorani")));

        }
}
