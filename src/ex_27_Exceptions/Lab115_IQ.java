package ex_27_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab115_IQ
{
    public static void main(String[] args)
    {
        try {
            FileReader f = new FileReader("C://abc.txt");
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
