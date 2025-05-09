package Task_April_6th_2025_If_Else;

import java.util.Scanner;

public class TypeofWebsites
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the URL :");
            String url = scanner.next();

            if (url.endsWith(".com"))
            {
                System.out.println("It displays as Commercial Website");
            }
            else if (url.endsWith(".org"))
            {
                System.out.println("It displays as Non Profit Organization");
            }
            else if (url.endsWith(".edu"))
            {
                System.out.println("It displays as Educational Institution");
            }
            else if (url.endsWith(".gov"))
            {
                System.out.println("It displays as Government Site");
            }
            else if (url.endsWith(".net"))
            {
                System.out.println("It displays as Network Related");
            }
            else if (url.endsWith(".info"))
            {
                System.out.println("It displays as Informational Site");
            }
            else
            {
                System.out.println("Unknown Site");
            }
            scanner.close();
        }
}
