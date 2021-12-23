package com.Riddhi;
//RIDDHI J073
//determine whether two strings are the anagram
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class anagram {
    public static void main (String [] args) {
        String str1;
        String str2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1");
        str1=sc.nextLine();
        System.out.println("Enter String 2");
        str2=sc.nextLine();




        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();


        if (str1.length() != str2.length()) {
            System.out.println("Both the strings are not anagram");
        }
        else {

            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();


            Arrays.sort(string1);
            Arrays.sort(string2);


            if(Arrays.equals(string1, string2) == true) {
                System.out.println("Both the strings are anagram");
            }
            else {
                System.out.println("Both the strings are not anagram");
            }
        }
    }
}