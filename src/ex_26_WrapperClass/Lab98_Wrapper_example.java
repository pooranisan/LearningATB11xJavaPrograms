package ex_26_WrapperClass;

public class Lab98_Wrapper_example extends Oldphone
    {
        public static void main(String[] args)
        {
        Mobile iphone = new Mobile(1, "iphone 16", 120000.00);
        Mobile Samsung = new Mobile(1, "Samsung 24", 130000.00);

        iphone.setPrice(150000.99);
        iphone.display();
        Samsung.display();

            System.out.println(Mobile.mobile_carrier);
            Mobile.SwitchonAirplanemode();

        }
        @Override

        void calling()
        {
            System.out.println("Dial Pad");
        }
}

class Mobile extends Oldphone
{
    //instance variable

    private Integer phone;
    private String name;
    private Double price;

    static String mobile_carrier = "airtel";

    Mobile()
    { //DC
        System.out.println("DC");
    }

    public Mobile(Integer phone, String name, Double price)
    {//PC
        this.phone = phone;
        this.name = name;
        this.price = price;
    }
    //Encapsulation -> getter and setter

    public Integer getPhone()
    {
        return phone;
    }
    public void setPhone(Integer phone)
    {
        this.phone = phone;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    static void SwitchonAirplanemode()
    {
        System.out.println("Common Airplane Mode");
    }
//Method Overloading

    void PriceChange(Integer Price)
    {
        System.out.println("Change Price");
    }

    void PriceChange(Double Price)
    {
        System.out.println("Change Price");
    }

    @Override
            void calling()
    {
        System.out.println("None");
    }
//   ============

    void display()
    {
        System.out.println(this.name+this.phone+this.price);
    }
}

class Oldphone
{

    void calling()
    {
        System.out.println("Dialpad");
    }
//@Override

public void entercard()
{
    System.out.println("Card Entered");
}
    interface Simcard
    {
        void entercard();
    }
}