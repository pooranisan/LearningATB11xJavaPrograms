package ex_29_CollectionFramework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab129_Nested_Arraylist
    {
        public static void main(String[] args)
        {
            List fruits1 = new ArrayList();
            fruits1.add("Orange");
            fruits1.add("Apple");
            System.out.println(fruits1);

            List fruits2 = new ArrayList();
            fruits2.add("Berry");
            fruits2.add("Gauva");
            System.out.println(fruits2);

            List veg = new ArrayList();
            veg.add("Onion");
            veg.add("Potato");
            System.out.println(veg);

            List all_fruits = new ArrayList();
            all_fruits.add(fruits1);
            all_fruits.add(fruits2);
            all_fruits.add(veg);

            System.out.println(all_fruits);
        }
}
