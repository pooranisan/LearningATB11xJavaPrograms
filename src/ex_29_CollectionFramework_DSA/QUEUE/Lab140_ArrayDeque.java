package ex_29_CollectionFramework_DSA.QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab140_ArrayDeque
{
    public static void main(String[] args)
    {
        Deque<Integer> deck = new ArrayDeque();
        deck.push(15);
        deck.push(10);
        System.out.println(deck);

    }
}
