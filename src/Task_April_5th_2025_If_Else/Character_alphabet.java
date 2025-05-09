package Task_April_5th_2025_If_Else;

import java.util.Scanner;

public class Character_alphabet
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a Character");
            char ch = scanner.next().charAt(0);

            if (Character.isAlphabetic(ch))
            {
                System.out.println("Input is a alphabet");
            }
            else
            {
                System.out.println("Input is not a alphabet");
            }
            scanner.close();
        }
}
