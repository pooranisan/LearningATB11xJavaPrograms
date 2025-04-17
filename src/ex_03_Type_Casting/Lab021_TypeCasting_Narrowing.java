package ex_03_Type_Casting;

public class Lab021_TypeCasting_Narrowing {

    public static void main(String[] args) {

        int val = 200;
        //byte b = val;
        byte b2 = (byte)val; // valid - narrowing - explicit casting is allowed
        System.out.println(b2);

    }
}
