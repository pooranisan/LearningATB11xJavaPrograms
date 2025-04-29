package ex_14_Arrays;

public class Lab_71_Sum_Arrays
    {
        public static void main(String[] args)
        {
            int [] numbers = {12, 34, 10};
            int sum = 0;

//            System.out.println("=======");

//            for (int i =0; i < numbers.length; i++)
//            {
//                sum = sum + numbers[i];
//            }
//            System.out.println(sum);

            System.out.println(" For Each ---"); //Enhanced Loop

            for (int n : numbers)
            {
                sum = sum + n;
            }
            System.out.println(sum);
        }
}
