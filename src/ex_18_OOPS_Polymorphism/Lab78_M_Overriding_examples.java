package ex_18_OOPS_Polymorphism;

public class Lab78_M_Overriding_examples
    {
        public static void main(String[] args)
        {
            ChromeTC c1=new ChromeTC();
            c1.OpenBrowser();
//            c2.OpenBrowser();

            FirefoxTC f1= new FirefoxTC();
            f1.OpenBrowser();

            CommonToAll commonToAll = new CommonToAll();
            commonToAll.OpenBrowser();

            //Dynamic Dispatch

            CommonToAll c2 = new CommonToAll();
            c2.OpenBrowser();


            }
}


class CommonToAll
{
    void OpenBrowser()
    {
        System.out.println("Open the IE Browser");
    }
}

class ChromeTC
{
    void OpenBrowser()
    {
        System.out.println("Open the Chrome Browser");
    }
}

class FirefoxTC
{
    void OpenBrowser()
    {
        System.out.println("Open the Firefox Browser");
    }
}