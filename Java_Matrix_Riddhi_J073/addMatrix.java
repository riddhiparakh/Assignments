package com.Riddhi;
//Riddhi J073
//Addition of 2 matrix
public class addMatrix {
    public static void main(String[] args) {
        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 3, 5}};
        int b[][] = {
                {1, 0, 0},
                {5, 8, 9},
                {3, 9, 5}};
        int c[][]=new int[3][3];
        for(int i=0;i<a.length;i++)
        {
            for (int j = 0; j < b.length; j++)
            {
                c[i][j] = a[i][j] + b[i][j];    //use - for subtraction
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }


        }
    }

