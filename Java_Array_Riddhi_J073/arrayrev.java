package com.Riddhi;
//Riddhi J073
//print the elements of an array in reverse order
public class arrayrev {
    public static void main(String[]args)
    {
      int[] arry=new int []{9,2,0,5,6,7,8};
        System.out.println("Og Array");
        for(int i=0;i<arry.length;i++)
        {
            System.out.println(arry[i]);
        }
        System.out.println("Array in reverse order :");
      for(int i=arry.length-1;i>=0;i--)

      {
          System.out.println(arry[i]);
      }
    }
}
