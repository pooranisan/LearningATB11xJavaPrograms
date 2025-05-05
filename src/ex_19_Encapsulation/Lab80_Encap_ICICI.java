package ex_19_Encapsulation;

public class Lab80_Encap_ICICI
    {
        public static void main(String[] args)
        {
            ICICI abc = new ICICI ("ABC",500);
            long bal = abc.getBal();
            System.out.println(bal);

            abc.setBal(1000);
            long bal_updated = abc.getBal();
            System.out.println(bal_updated);


        }
}

class ICICI
{
    private String name;
    private long bal;

    public ICICI (String name, long bal)
    {
        this.name = name;
        this.bal = bal;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public long getBal()
    {
        return bal;
    }

    public void setBal(long bal)
    {
        boolean isCashier = true;

        if(isCashier)
        {
            this.bal = bal;
        }
        else
        {
            System.out.println("Not allowed to change the balance");
        }

    }
}
