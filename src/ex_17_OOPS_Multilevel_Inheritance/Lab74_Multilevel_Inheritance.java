package ex_17_OOPS_Multilevel_Inheritance;

public class Lab74_Multilevel_Inheritance
    {
        public static void main(String[] args)
        {
            grandfather gf = new grandfather();
            gf.gf();
            System.out.println("======");

            father_multi f = new father_multi();
            f.f();
            f.gf();
            System.out.println("=======");

            son_multi s = new son_multi();
            s.s();
            s.f();
            s.gf();
        }
}
