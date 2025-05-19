package ex_29_CollectionFramework_DSA.QUEUE;

import java.util.PriorityQueue;

public class Lab138_Queue
{
    public static void main(String[] args)
    {
        PriorityQueue q = new PriorityQueue();

        q.add("Poorani");
        q.add("Chandiran");

        System.out.println(q);  //Natural sorting
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);

    }
}
