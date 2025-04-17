package ex_03_Type_Casting;

public class Lab022_TypeCasting {

    public static void main(String[] args) {

        long phonenumber = 1234567890l;
        //short s = phonenumber;

        short s = (short) phonenumber;
        System.out.println(s);
    }
}
