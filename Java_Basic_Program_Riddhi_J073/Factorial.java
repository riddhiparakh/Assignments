package com.Riddhi;
import java.util.Scanner;
public class Factorial {
    public static void main(String[]args)
    {
        int i;
        int fac=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find Factorial:");
        int factorial=sc.nextInt();

        for(i=1;i<=factorial;i++)
        {
            fac=fac*i;
        }
        System.out.println("Factorial of "+factorial+" is "+fac);

    }
}
