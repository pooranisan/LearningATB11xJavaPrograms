package Task_4th_April_2025;

import java.util.Scanner;

public class Character_Vowel_Consonant
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a single character");

            char ch = scanner.next().charAt(0);
            ch = Character.toLowerCase(ch);

            if(!Character.isLetter(ch))
            {
                System.out.println("Please enter a letter");
            }

            else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                System.out.println("Character is a vowel");
            }
            else
            {
                System.out.println("Character is not a vowel");
            }

            scanner.close();

        }
}
