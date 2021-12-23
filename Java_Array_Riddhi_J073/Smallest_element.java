package com.Riddhi;
//Riddhi J073
//Program to print the smallest element in an array
public class Smallest_element {
    public static void main(String[]args)
    {
        int[] arry1=new int[]{224,33,11,55};
        int min=arry1[0];
        for(int i=0;i<arry1.length;i++)
        {
            if(arry1[i]<min)
                min=arry1[i];

        }
        System.out.println("Smallest element in the array is:"+min);

    }
}
