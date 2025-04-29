package ex_14_Arrays;

public class Task_27th_March_Odd_Even_Numbers {
    public static void main(String[] args) {
        int[] arr = {12, 13, 27, 34, 46};
        System.out.println("Checking for even numbers and odd numbers in the array");

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                System.out.println(arr[i] + " Even");
            } else
            {
                System.out.println(arr[i] + " Odd");
            }
        }
    }
}

