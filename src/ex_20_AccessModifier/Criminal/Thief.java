package ex_20_AccessModifier.Criminal;

import ex_20_AccessModifier.Police.cop;

public class Thief
    {
        public static void main(String[] args)
        {
            cop thief = new cop(100);
            thief.Canishoot();
            System.out.println(thief.gun);

        }
}
