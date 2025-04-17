package ex_02_Java_Basics_part2;

import static java.lang.Math.abs;
import static java.lang.Math.cbrt;

public class Lab017_Program_Math_Functions {

    public static void main (String [] args)
                {
                    int x =10;
                    int y = 10;
                    int z = 10;

                    int number = x * x;
                    int number1 = y * y;
                    int number2 = abs(z);
                    double i = number + number1 - number2;

//                    System.out.println("The value of x squared" + "=" +number);
//                    System.out.println("The value of y squared" + "=" + number1);
//                    System.out.println("The absolute value of z" + "=" + number2);

                    System.out.println(cbrt(i));



                }


}
