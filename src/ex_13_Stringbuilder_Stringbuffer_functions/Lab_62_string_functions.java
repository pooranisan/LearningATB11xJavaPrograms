package ex_13_Stringbuilder_Stringbuffer_functions;

public class Lab_62_string_functions
        {
            public static void main(String[] args)
            {
                String name = "Sonal Krishna";
                String name1 = "Krishna";

                System.out.println(name.length()); // length
                System.out.println(name.charAt(3)); // char

                System.out.println(name.concat("Krishna")); // concat

                System.out.println(name.contains("al")); // contains

                System.out.println(name.equals("Sonal")); // equals

                System.out.println(name.equalsIgnoreCase("Sonal"));
//
                System.out.println(name.indexOf("l")); // indexof

                System.out.println(name.replace('K','k')); // replace
//
                String name2 = "poorani@chandiran@live.com";
                String[] split = name2.split("@");
                System.out.println(split[0]);
                System.out.println(split[1]);
                System.out.println(split[2]); // split
//
//                System.out.println(name.substring(1, 3)); // substring

                System.out.println(name1.startsWith("K"));
                System.out.println(name1.endsWith("k"));

                System.out.println(name1.trim()); //trim

                System.out.println(name.compareTo("Sonal"));

                StringBuilder stringBuilder = new StringBuilder("Sonal");
                stringBuilder.append("Krishna");
                System.out.println(stringBuilder);

                StringBuilder sb = new StringBuilder("Hiii");
                System.out.println(sb.toString());

                String anotherpalindrome = "Niagara. 0 roar again";
                String roar = anotherpalindrome.substring(11, 15);
                System.out.println(roar);



            }

}

