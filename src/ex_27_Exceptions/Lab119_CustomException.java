package ex_27_Exceptions;

public class Lab119_CustomException
{
    public static void main(String[] args) throws CurrencyMismatchCustomException
    {
    Bank sbi = new Bank("INR", 100);
    Bank ICICI = new Bank("INR", 200);
    Bank jp_chase = new Bank("USD", 300);
    int total = sbi.add(ICICI);
    int total1 = sbi.add(jp_chase);
        System.out.println(total);
//        System.out.println(total1);

    }
}
