package ex_08_For_Loop;

public class Lab_40_For_Loop_Top_50 {

    public static void main(String[] args) {

        //to find the even numbers from 1 to 50

        for (int i = 0; i <= 50; i++)
        {
            //if (i%2 ==0)
            if (i%2 !=0) //odd number
            {
                System.out.println("Number is Even : "+i);
                //continue;
            }
        }
    }
}
