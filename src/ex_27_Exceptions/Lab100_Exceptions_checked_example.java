package ex_27_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab100_Exceptions_checked_example
    {
        public static void main(String[] args)
        {
            try
            {
                FileInputStream fileInputStream = new FileInputStream("testdata.txt");
            }
            catch(FileNotFoundException e)
            {
                System.out.println("File Not Found" + e.getMessage());
            }
//            FileInputStream fileInputStream = new FileInputStream("testdata.txt");
            //This will give you error because file cannot exist in that location
        }
}
