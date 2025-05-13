package ex_26_WrapperClass;

public class Lab97_Wrapper_Conversion_1
    {
        public static void main(String[] args)
        {
            String number = "10";
            int aaa = 10;

            //String -> Wrapper -> ParseX()
//            Integer.parseInt(number)
//                    Double.parseDouble(number)

            Integer a = Integer.parseInt(number);
            Integer b = Integer.valueOf(number); // another way of declaration

            //String to Primitive

            int aa = Integer.parseInt(number);

            //Wrapper to String

            System.out.println(a.toString());

            //Primitive to String

            int age = 10;
            Integer age_Wrapper = age;
            System.out.println(age_Wrapper.toString());


        }
}
