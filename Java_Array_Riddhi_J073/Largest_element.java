package com.Riddhi;

public class Largest_element {
    public static void main(String[] args) {
        int[] arry1 = new int[]{90,22,300,222,1000};
        int max = arry1[0];
        for (int i = 0; i < arry1.length; i++) {
            if (arry1[i] > max)
                max = arry1[i];

        }
        System.out.println("Largest element in the array is:" + max);

    }
}
