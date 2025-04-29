package ex_14_Arrays;

public class Lab_68_Array_Max_Min
    {
        public static void main(String[] args)
        {
            int [] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

            int max_output = give_me_max(array);
            System.out.println(max_output);

            int min_output = give_me_min(array);
            System.out.println(min_output);

        }

        private static int give_me_min(int[] array)
        {
            int min = array[0];
            for (int i = 0; i < array.length; i++)
            {
                if(array[i] < min)
                {
                    min = array [i];
                }
            }
            return min;

        }

        private static int give_me_max(int[] array)
        {
            int max = array[0];
            for (int i =0; i < array.length; i++)
            {
                if(array[i] > max)
                {
                    max = array [i];

                }
            }
            return max;

        }

    }
