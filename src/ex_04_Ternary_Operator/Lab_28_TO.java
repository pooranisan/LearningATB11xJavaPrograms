package ex_04_Ternary_Operator;

public class Lab_28_TO {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = -15;

        int max = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;

        System.out.println(max);

    }
}
