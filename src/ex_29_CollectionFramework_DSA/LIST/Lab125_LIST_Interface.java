package ex_29_CollectionFramework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab125_LIST_Interface
    {
        public static void main(String[] args)
        {
//            List fruits = new List();
            List fruits = List.of("apple", "orange", "Grapes");
            System.out.println(fruits);

            List l = new ArrayList();
            ArrayList l2 = new ArrayList();
            l.add("hello");
            l.add(123);
            l.add(true);
            l.add("Blah Blah");

        }
}
