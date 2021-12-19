package com.Riddhi;
//Riddhi J073
/*
* Concept of Neon Number:
* 1.Take the square of the given number.
* 2.Add the digits for eg 9 sqaure 81 sum of 8+1=9
* 3.If sum=entered/input number then the number is a neon number.
* */

import java.util.Scanner;
public class neon {
    public static void main(String[] args){
        int num;//initiating a integer variable called num
        System.out.println("Enter the number to check if the number is neon or not");//taking input
        Scanner sc=new Scanner(System.in);
        num =sc.nextInt();
        int square=num*num;//taking square of the number.
        int sum=0;
        //Calculating Sum
        while(square!=0)
        {
            int a=square%10;
            sum=sum+a;
            square=square/10;
        }
        //Checking if sum=num
        if(sum==num)
        {
            System.out.println(num+" is a Neon Number.");
        }
        else
        {
            System.out.println(num+" is not a Neon Number.");
        }
    }

}
