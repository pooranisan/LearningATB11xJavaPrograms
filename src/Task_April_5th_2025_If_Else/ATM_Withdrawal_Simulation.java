package Task_April_5th_2025_If_Else;

import java.util.Scanner;

public class ATM_Withdrawal_Simulation
    {
        public static void main(String[] args)
        {
            int acc_bal = 10000;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to ATM");
//            System.out.println("Your current balance :");

            System.out.println("Enter the amount you want to withdraw");
            int withdrawal_amount = scanner.nextInt();

            if(withdrawal_amount <=0)
            {
                System.out.println("Error, The withdrawal amount should be greater than zero");
            }
            else if (withdrawal_amount % 100 != 0)
            {
                System.out.println("Amount should be in multiples of 100");
            }
            else if (withdrawal_amount >= acc_bal)
            {
                System.out.println("Amount should not exceed the account balance");
            }
            else
            {
                acc_bal = acc_bal - withdrawal_amount;
                System.out.println("My Current Balance :" + acc_bal);
            }
            scanner.close();

        }

    }
