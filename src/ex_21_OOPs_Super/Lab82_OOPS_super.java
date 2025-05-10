package ex_21_OOPs_Super;

public class Lab82_OOPS_super
    {
        public static void main(String[] args)
        {
            System.out.println("Printing the Messages");
        }

        class God
        {
            void sound()
            {
                System.out.println("God Sound");
            }
        }

        class Animal extends God
        {
            protected String color = "White";

            void sound()
            {
                System.out.println("Animal Sound");
                super.sound();
            }
        }

        class Dog extends Animal
        {
            private String color = "Black";

            void display()
            {
                System.out.println(this.color);
                System.out.println(super.color);
                super.sound();
            }
        }
}
