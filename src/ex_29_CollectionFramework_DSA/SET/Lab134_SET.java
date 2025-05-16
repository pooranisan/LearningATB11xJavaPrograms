package ex_29_CollectionFramework_DSA.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab134_SET
{
    public static void main(String[] args)
    {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Pramod");
        hs.add("Dutta");
        hs.add("Pramod"); //duplicates are not allowed
        System.out.println(hs);

    }
}
