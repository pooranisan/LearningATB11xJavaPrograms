package ex_19_Encapsulation;

public class Lab79_Encapsulation
    {
        public static void main(String[] args)
        {
            VWOLogin vwologin = new VWOLogin("admin", "pass123");
            System.out.println(vwologin.password);
            vwologin.password = "345";
            System.out.println(vwologin.password);

            GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin","pass123");
//            System.out.println(vwologin.password);
//            System.out.println(vwologin.username);

            vwoLogin1.setUsername("Poorani");
            System.out.println(vwoLogin1.getUsername());
            System.out.println(vwoLogin1.getPassword());

            vwoLogin1.setPassword("12345",true);
            System.out.println(vwoLogin1.getPassword());
        }
}

class VWOLogin
{
    public String username;   //childrens
    public String password;

    VWOLogin (String usr, String pwd)
    {
        this.username = usr;  //parameterized constructor
        this.password = pwd;

    }
}

class GoodVWOLogin
{
    private String username;  //they can be accessed only inside this class
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
       if (isAdmin)
       {
           this.password = password;
       }
       else
       {
           System.out.println("Not allowed to change the password");
       }

    }

    public GoodVWOLogin (String usr, String pwd)
    {
        this.username = usr;
        this.password = pwd;
    }
}