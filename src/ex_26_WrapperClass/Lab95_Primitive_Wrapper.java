package ex_26_WrapperClass;

public class Lab95_Primitive_Wrapper
    {
        public static void main(String[] args)
        {
            int a =10; //normal variable declaration

            Integer age = 65;
//            System.out.println(Integer.parseInt(String.valueOf(age)));
//            System.out.println(Integer.toHexString(Integer.parseInt(String.valueOf(a))));
            System.out.println(age);
            System.out.println(age.intValue());
        }
}
