package ex_06_If_Loop;

public class Task_14th_March_Increment_Decrement {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        System.out.println(++a + a++ + a++); //11 + 11 + 12 = 34 (pre increment& post increment)
        System.out.println(--b + b-- + b--); //14 +14 + 13 = 41 (pre decrement & post decrement)

       //11 + 11 + 12 = 34
        System.out.println(a); // 13

        System.out.println(b); //12
    }

}
