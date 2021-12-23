package com.Riddhi;
//Riddhi J073
//Java Number Program
//ATM program Java
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Atm {
    public static void main(String[] args)
    {

        int balance=100000,withdrawal,deposit,balance1,deposit1;

        Scanner sc=new Scanner(System.in);
        //printing main menu
        while(true)
        {
            System.out.println("                          Welcome to MNC ATM                                    ");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("                           Select 1 :To check Balance                           ");
            System.out.println("                           Select 2 :To Withdraw                                ");
            System.out.println("                           Select 3 :To Deposit                                 ");
            System.out.println("                           Select 4 :To Exit                                    ");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("                            Choose the operation :");

            //taking choice from user
            int choice=sc.nextInt();
                    switch (choice)
                    {
                        //check balance
                        case 1:
                            System.out.println("Your Balance is Rs."+balance);
                            break;
                       //check withdrawal
                        case 2:
                            System.out.println("Please enter the amount you would like to withdraw:");
                            withdrawal= sc.nextInt();
                            if(withdrawal>balance)
                                System.out.println("Invalid Withdrawal");

                            else
                            {
                                balance1=balance-withdrawal;
                                System.out.println("Collect your money");
                                System.out.println("Remaining Balance = Rs."+balance1);

                            }
                            break;
                            //deposit money
                        case 3:
                            System.out.println("Please Enter the amount of money to be deposited:");
                            deposit=sc.nextInt();
                            System.out.println("Your money has been successfully deposited");
                            deposit1=balance+deposit;
                            System.out.println("Remaining Balance is Rs."+deposit1);
                            break;
                            //exit
                        case 4:
                            System.exit(0);
                    }
        }

    }

}
