package ex_29_CollectionFramework_DSA.LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab128_AL
    {
        public static void main(String[] args)
        {
            List marks = new ArrayList();
            marks.add(100);
            marks.add(91);
            marks.add(45);
            marks.add(65);

            System.out.println(marks);
            Collections.sort(marks);
            System.out.println(marks);

            Collections.sort(marks,Collections.reverseOrder());
            System.out.println(marks);


        }
}
