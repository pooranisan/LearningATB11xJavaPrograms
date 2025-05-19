package Task_19thApril2025;

public class Encapsulation
{
    public static void main(String[] args)
    {
        Bankaccount account = new Bankaccount();
        account.setName("Poorani Chandiran");
        account.setBalance(5000);

        System.out.println("Account Holder Name:" + account.getName());
        System.out.println("Account Holder Balance:" + account.getBalance());
    }
}

class Bankaccount
{
    private String name;
    private double balance;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        if (balance >= 0)

        {
            this.balance = balance;
        }
    }
}