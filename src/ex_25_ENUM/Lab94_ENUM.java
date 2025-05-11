package ex_25_ENUM;

public class Lab94_ENUM
    {
        public static void main(String[] args)
        {
            System.out.println(Locators.page_button.getLocators());
            System.out.println(Locators.page_input.getLocators());

            System.out.println("---");

            System.out.println(Colors.RED.getHexcode());
            System.out.println(Colors.GREEN.getHexcode());
            System.out.println(Colors.BLUE.getHexcode());
            System.out.println(Colors.YELLOW.getHexcode());

            System.out.println("---");
            System.out.println(APIURL.google.getUrl());
            System.out.println(APIURL.VWO.getUrl());
            System.out.println(APIURL.katalon.getUrl());

        }
}
