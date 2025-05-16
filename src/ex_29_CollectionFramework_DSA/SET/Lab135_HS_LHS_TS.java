package ex_29_CollectionFramework_DSA.SET;

import java.util.*;

public class Lab135_HS_LHS_TS
{
    public static void main(String[] args)
    {
        //HashSet

        Set<String> hs = new HashSet();
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add(null);

        System.out.println(hs);
        System.out.println("--------------");

        for(String s : hs)
        {
            System.out.println(s);
        }

        System.out.println("---------");

        //Iterator

        Iterator iterator = hs.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("---------");

        //Linked Hash Set

        Set lhs = new LinkedHashSet();

        lhs.add("Dpple");
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println("---------");

        //Tree Set

        Set ts = new TreeSet();

        ts.add("Dapple");
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("Watermelon");
//        ts.add(" ");
//        ts.add(123);
//        ts.add(null);

        System.out.println(ts);

        System.out.println("--------For Each --------");

        for (Object o : ts)
        {
            System.out.println(o);
        }

    }
}
