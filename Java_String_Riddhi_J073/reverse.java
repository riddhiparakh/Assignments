package com.Riddhi;
//Riddhi Parakh
//Java Program to find Reverse of the string.
public class reverse {
    public static void main(String[] args)
    {
        String rev="Riddhi";
        String empty=" ";
        int i;
        for(i=rev.length()-1;i>=0;i--){
          empty+=rev.charAt(i);
        }
        System.out.println("Reverse string:"+empty);
    }
}
