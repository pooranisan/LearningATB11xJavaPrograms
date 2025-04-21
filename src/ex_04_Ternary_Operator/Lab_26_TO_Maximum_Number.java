package ex_04_Ternary_Operator;

public class Lab_26_TO_Maximum_Number {

    public static void main(String[] args) {

        //Maximum of two numbers using TO
        int a = 10;
        int b = 15;

        System.out.println(Math.max(a,b));
        //int max = a > b? a:b;
        String max =a>b? "A is Maximum": "B is Maximum";
        System.out.println(max);


    }
}
