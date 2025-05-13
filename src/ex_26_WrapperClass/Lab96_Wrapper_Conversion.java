package ex_26_WrapperClass;

public class Lab96_Wrapper_Conversion
    {
        public static void main(String[] args)
        {
            int a = 10;
            Integer b = a;   //Boxing, primitive to wrapper -> Auto boxing

            System.out.println(b.intValue()); //Behaviour
        }
}

//class ATB11
//{
//    String name;
//    Long phone;
//    Integer age;
//    Double Salary;
//    Float GST;
//    Boolean isMarried;
//
//}
