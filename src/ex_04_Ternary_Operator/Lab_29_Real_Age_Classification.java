package ex_04_Ternary_Operator;

import org.w3c.dom.ls.LSOutput;

public class Lab_29_Real_Age_Classification {

    public static void main(String[] args) {

        //scenario : Age = 30;
        // Age < 18 : Minor
        //Age > 18 : Adult
        //Age > 65 : Senior Citizen

        String age1 =args[0];
        System.out.println(age1);
        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);
        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";

        System.out.println(result);


    }
}
