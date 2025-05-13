package Task_April_12th_2025_ForLoop;

public class Sum_Numbers_1to100
    {
        public static void main(String[] args)
        {
            int sum = 0;
            for (int i = 0; i <= 100; i++)
            {
                sum = sum + i;
            }
            System.out.println("The Sum of Natural Number is : " + sum);
        }
}
