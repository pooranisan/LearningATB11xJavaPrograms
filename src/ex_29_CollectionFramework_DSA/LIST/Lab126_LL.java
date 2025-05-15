package ex_29_CollectionFramework_DSA.LIST;

import java.util.LinkedList;

public class Lab126_LL
    {
        public static void main(String[] args)
        {
            LinkedList animals = new LinkedList();


            animals.add("Dog");
            animals.add("Cat");
            animals.addFirst("Lion");
            animals.addLast("Elephant");

            //Accessing the elements using getfirst() and getLast()
            //Removing the elements using removefirst() and removelast()

            System.out.println("LinkedList :" + animals);
            System.out.println("Size of LinkedList:" + animals.size());



        }
}
