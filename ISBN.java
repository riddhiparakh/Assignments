package com.Riddhi;

import java.util.Scanner;
//Riddhi-J073
/*To check if the number is an ISBN number
* 1.Input a 10 digit ISBN number.
* 2.Then check if the number is 10 digit or not
* 3.If it is 10 digit number calculate sum of the digits by multiplying each digit with its last position.
* 4. Divide the sum by 11
* 5.If divisible by 11 then the entered number is a correct isbn number.
* */
public class ISBN {
    public static void main(String[] args){
        long num,c=0,reverse,sum=0,i;
        System.out.println("Enter a 10-digit ISBN number:");//taking user input
        Scanner sc=new Scanner(System.in);
        num =sc.nextLong();
        //While loop is used to check whether given number is of 10 digits
        while (num>0)
        {
            num=num/10;
            c++;
        }
        //after using while loop above we get to know that whether the given number is of 10 digits
        //if c != 10 then it's not an illegal isbn number
        if(c!=10)
        {
            System.out.println("Entered ISBN number is not of 10 digits");
        }
        //calculating sum of the entered isbn number.
        else{
            for(i=10;i>=1;i--)
            {
               reverse=num%10;
               sum=sum+(reverse*1);
               num=num/10;
            }
            //divide the sum by 11 to check whether its an isbn number.
            if(sum%11==0)
            {
                System.out.println("Entered number  is a valid ISBN Number:");
            }
            else
            {
                System.out.println("It is not a valid ISBN Number.");
            }

        }


    }
}
