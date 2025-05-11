package Task_April_8th_2025_WhileLoop;

public class Printing_Sum_Natural_Numbers
    {
        public static void main(String[] args)
        {
            int i = 1;
            int sum = 0;

            while (i <= 10)
            {
                sum = sum + i;
                i++;
            }
            System.out.println("Sum of first 10 natural numbers :" + sum);
        }
}
