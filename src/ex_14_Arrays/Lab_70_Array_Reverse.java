package ex_14_Arrays;

public class Lab_70_Array_Reverse
    {
        public static void main(String[] args)
        {
            int[] numbers = {1, 2, 3, 4, 5};

            for (int i = numbers.length -1; i >= 0; i--)
            {
                System.out.println(numbers[i]);
            }
        }
}
