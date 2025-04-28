package ex_12_Strings;

public class Lab_64_Builder_Buffer
    {
        public static void main(String[] args)
        {
//         StringBuffer stringBuffer = new StringBuffer("Poorani");
//         stringBuffer.append("Chandiran");
//            System.out.println(stringBuffer);
//            System.out.println(stringBuffer.reverse());

            StringBuilder stringBuilder = new StringBuilder("Poorani");
            stringBuilder.append("  Chandiran");
            System.out.println(stringBuilder);
            System.out.println(stringBuilder.reverse());


        }
}
