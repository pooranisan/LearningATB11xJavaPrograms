package ex_07_Switch_Case;

import java.util.Scanner;

public class Lab_35_Switch_Automation {

    public static void main(String[] args) {

//        String browser = args[0];
//        System.out.println(browser);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();

        switch(browser)
        {
            case "Chrome":
                System.out.println("Starting the chrome");
                System.out.println("----------------");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "Firefox":
                System.out.println("Starting the Firefox");
                System.out.println("----------------");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "Edge":
                System.out.println("Execute the edge code");
                break;
            default:
                System.out.println("No idea which browser is this");
                break;
        }

    }
}
