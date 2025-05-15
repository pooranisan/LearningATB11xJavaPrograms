package ex_29_CollectionFramework_DSA.LIST;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab130_UserInput_AL
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            ArrayList names = new ArrayList();
            ArrayList ages = new ArrayList();

            String continueInput = "Y";

            while (continueInput.equalsIgnoreCase("Y"))
            {
                System.out.println("Enter the name");
                String name = scanner.next();
                names.add(name);

                System.out.println("Enter the age");
                Integer age = scanner.nextInt();
                ages.add(age);

                scanner.nextLine();
                System.out.println("Do you want to enter another record? (Y/N): ");
                continueInput = scanner.nextLine();
            }

            for (Object o1: names)
            {
                System.out.println(o1);
            }

            for (Object o2: ages)
            {
                System.out.println(o2);
            }

            scanner.close();
        }
}

