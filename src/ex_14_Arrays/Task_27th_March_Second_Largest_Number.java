package ex_14_Arrays;

public class Task_27th_March_Second_Largest_Number
        {
            public static void main(String[] args)
            {
                int[] arr = {25, -45, 12, 35, -54}; // Array declaration

            int largest = Integer.MIN_VALUE;
            int second_largest = Integer.MIN_VALUE;

            int i;

        for (i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                second_largest = largest;
                largest = arr[i];
            }
            else if (arr[i] > second_largest && arr[i] != largest)
            {
                second_largest = arr[i];
            }

        }
        System.out.println("First largest number : " + largest);

        if (second_largest == Integer.MIN_VALUE)
        {
            System.out.println("There is no second largest number");
        }
        else
        {
            System.out.println("Second largest number : " + second_largest);
        }
    }
}
