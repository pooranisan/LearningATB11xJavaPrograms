package Task_April_12th_2025_WhileLoop;

public class Sum_Numbers_1to100
    {
        public static void main(String[] args)
        {
            int sum = 0;
            int i = 1;
            while (i <= 100)
            {
                sum = sum + i;
                i++;
            }
            System.out.println("The Sum of Natural Number is : " + sum);
        }
}
