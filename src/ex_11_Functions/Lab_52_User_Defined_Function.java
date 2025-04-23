package ex_11_Functions;

public class Lab_52_User_Defined_Function {
    public static void main(String[] args) {
        int r1 = sum_of_two_numbers(3,4);

        System.out.println(r1);
    }


    static int sum_of_two_numbers(int a, int b) {
        return a + b;
    }
}