package ex_11_Functions;

import java.util.Scanner;

public class Task_21st_March_Vowels {
    public static void main(String[] args) {
        //taking inputs

        Scanner scanner = new Scanner(System.in);

        String vowels = "AEIOU"; //Define uppercase vowels separately
        String vowels1 = "aeiou"; //define lowercase vowels separately

        System.out.print("Enter a word:");
        String input = scanner.nextLine();

        //initializing 2 string for vowels and consonants

        StringBuilder vowel_list = new StringBuilder(); //to store all vowels
        StringBuilder consonant_list = new StringBuilder(); // to store all consonants

        int Vowel_Count = 0;
        int Consonant_Count = 0;

        int i;

        for (i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (Character.isLetter(ch))
            {
                if (vowels.indexOf(ch) != -1 || vowels1.indexOf(ch) != -1)
                {
                    vowel_list.append(ch).append(" ");
                    Vowel_Count++;
                } else
                {
                    consonant_list.append(ch).append(" ");
                    Consonant_Count++;

                }

            }
        }
        System.out.println("Vowels: " + vowel_list.toString());
        System.out.println("Vowel Count :" + Vowel_Count);

        System.out.println("Consonants: " + consonant_list.toString());
        System.out.println("Consonant Count :" + Consonant_Count);


        scanner.close();
    }
}





