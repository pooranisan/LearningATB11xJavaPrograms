package ex_27_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab116_Throws
{
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("Starting");
        try
        {
            FileInputStream fileInputStream = new FileInputStream("C://a.log");
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
