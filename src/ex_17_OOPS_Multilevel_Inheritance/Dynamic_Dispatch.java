package ex_17_OOPS_Multilevel_Inheritance;

public class Dynamic_Dispatch
    {
        public static void main(String[] args)
        {
            grandfather g1 = new grandfather();
            g1.gf();
            g1.home();
            System.out.println("**********");

            grandfather g2 = new father_multi();
            g2.gf();
            g2.home();
            System.out.println("********");

            father_multi f = new son_multi();
            f.f();
            f.home();

        }
}
