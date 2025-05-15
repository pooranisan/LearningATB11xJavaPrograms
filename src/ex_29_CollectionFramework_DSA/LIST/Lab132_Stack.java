package ex_29_CollectionFramework_DSA.LIST;

import java.util.Stack;

public class Lab132_Stack
    {
        public static void main(String[] args)
        {
            Stack s = new Stack();
            s.push("Poorani");
            s.push("Chandiran");
            s.push("Mythili");
            s.push("Chandiran");
            System.out.println(s);

            System.out.println(s.size());
            System.out.println(s.peek());
            System.out.println(s);
            System.out.println(s.pop());
            System.out.println(s);

        }
}
