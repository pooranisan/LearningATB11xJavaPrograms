package ex_03_Type_Casting;

public class Lab023_TypeCasting_Used {

    public static void main(String[] args) {

        int course_fee = 100;
        float GST = 18.45f;
        //int total = course_fee + GST; //Narrow - Implicit
        int total1 = course_fee + (int)GST; //Narrow - Explicit

        float total2 = course_fee + GST;
        float total3 = (float)course_fee + GST;
        //System.out.println(total);
       System.out.println(total1); // widening auto - implicit
        System.out.println(total2); //widening explicit
        System.out.println(total3);
    }
}
