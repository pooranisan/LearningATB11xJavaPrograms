package ex_14_Arrays;

public class Lab_66_Arrays
{
    public static void main(String[] args)
    {
        String [] names = {"Shobana","Mythili","Poorani"}; //method 1 declaration

        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[1]);


        String [] names1  = new String[3]; // method 2 declaration
        names1[0] = "Shobana";
        names1[1] = "Mythili";
        names1[2] = "Poorani";

    }
}
