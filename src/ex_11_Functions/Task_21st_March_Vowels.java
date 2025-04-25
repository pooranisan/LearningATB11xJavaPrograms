package ex_11_Functions;

import java.util.Scanner;

public class Task_21st_March_Vowels {
    public static void main(String[] args) {
        //taking inputs

        Scanner scanner = new Scanner(System.in);

        String vowels = "AEIOU"; //Define uppercase vowels separately
        String vowels1 = "aeiou"; //define lowercase vowels separatelt

        System.out.print("Enter a word:");
        String input = scanner.nextLine();

        //initializing 2 string for vowels and consonants

        StringBuilder vowel_list = new StringBuilder(); //to store all vowels
        StringBuilder consonant_list = new StringBuilder(); // to store all consonants

        int i;

        for (i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (Character.isLetter(ch))
            {
                if (vowels.indexOf(ch) != -1 || vowels1.indexOf(ch) != -1)
                {
                    vowel_list.append(ch).append(" ");
                } else
                {
                    consonant_list.append(ch).append(" ");
                }

            }
        }
        System.out.println("Vowels: " + vowel_list.toString());
        System.out.println("Consonants: " + consonant_list.toString());

        scanner.close();
    }
}





