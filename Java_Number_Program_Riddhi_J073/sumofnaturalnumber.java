package com.Riddhi;
//Riddhi Parakh J073
import java.util.Scanner;
public class sumofnaturalnumber {
    public static void main(String[] args){

        int i,number,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("To find sum of n Natural Numbers, give value of n");
        number= sc.nextInt();
        for(i=0;i<=number;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of First "+number+" Natural NUmber is:"+sum);
    }
}
