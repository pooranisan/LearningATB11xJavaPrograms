package ex_02_Java_Basics_part2;

import static java.lang.Math.cbrt;
public class Lab018_Alternate_Program_Math_Function1 {

    public static void main(String[] args) {

        int x = 10;
        int y = 10;
        int z = 10;

        double result = cbrt(Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z));
        System.out.println(result);

    }

}
