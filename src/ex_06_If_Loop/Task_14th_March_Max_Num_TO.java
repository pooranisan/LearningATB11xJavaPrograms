package ex_06_If_Loop;

public class Task_14th_March_Max_Num_TO {
    public static void main(String[] args) {

//User input
        int max = Integer.parseInt(args[0]);
        int max1 = Integer.parseInt(args[1]);

//        if (max > max1)
//        {
//            System.out.println("max is bigger");
//        }
//        else
//        {
//            System.out.println("max1 is bigger");
//        }
        int max2 = (max>max1) ? max : max1;
        System.out.println("Max number is: "+max2);

        //System.out.println((max > max1) ? "max is bigger" : "max1 is bigger");

    }
}
