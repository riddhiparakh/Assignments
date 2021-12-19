package com.Riddhi;

import java.util.Scanner;

//Riddhi J073
/*
 * For Armstrong NUmber:
 * 153=1*3+5*3+3*3=153
 * */
public class Armstrong {
    public static void main(String[] args) {
        //declaring a number to test armstrong test.
        int num, newnum = 0, e = 0, sum = 0, div;
        System.out.println("Enter the number to check if the number Armstrong:");//taking input
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        num = newnum;
        //count number of digits
        while (newnum > 0) {
            newnum = newnum / 10;
            e++;
        }
        //checking whether armstrong or not
        while (newnum > 0) {
            div = newnum % 10;
            sum += (Math.pow(div, e));
            newnum = newnum / 10;

        }
        //Printing output
        if (num == sum)
            System.out.println("Number is Armstrong");
        else
            System.out.println("Number is not Armstrong");

    }
}
