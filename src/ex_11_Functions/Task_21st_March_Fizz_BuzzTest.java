package ex_11_Functions;

public class Task_21st_March_Fizz_BuzzTest {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <=100; i++)
        {
            if (i%3 == 0 && i%5 ==0)
            {
                System.out.println("Print Fizz Buzz");
            } else if (i%3 ==0)
            {
                System.out.println("Print Fizz");
            } else if (i%5 ==0)
            {
                System.out.println("Print Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }

    }
}

