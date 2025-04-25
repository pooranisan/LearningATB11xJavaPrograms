package ex_11_Functions;

import java.util.Scanner;

public class Task_21st_March_Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String input = sc.nextLine();

        boolean result = isPalindrome(input);

        if (result)
        {
            System.out.println("The string is a palindrome.");
        }
        else
        {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
        public static boolean isPalindrome (String str)
        {
            str = str.toLowerCase(); // Make case-insensitive
            int left = 0;
            int right = str.length() - 1;

            while (left < right)
            {
                if (str.charAt(left) != str.charAt(right))
                {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }





