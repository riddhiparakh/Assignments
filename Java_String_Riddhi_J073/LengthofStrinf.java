package com.Riddhi;
//Riddhi J073
//Java Program to count the total number of characters in a string
public class LengthofStrinf {
    public static void main(String[] args)
    {
        int i,j=0;
        String ch="With great power comes great responsibilty";
        for(i=0;i<ch.length();i++)
        {
            if(ch.charAt(i)!=' ')
                j++;
        }
        System.out.println("Total number of characters in a string:"+j);
    }
}
