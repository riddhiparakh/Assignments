package com.Riddhi;

public class product {
    public static void main(String[]args)
    {
        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 3, 5}};
        int b[][] = {
                {1, 0, 0},
                {5, 8, 9},
                {3, 9, 5}};
        int row1=a.length;
        int cow1=a[0].length;
        int row2=b.length;
        int cow2=b[0].length;

        if(cow1!=row2)
            System.out.println("Cannot Multiply Matrix.");
        else
        {
            int product[][]=new int[row1][cow2];
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<cow2;j++)
                {
                    for(int k=0;k<row2;k++)
                    {
                       product[i][j]+=a[i][k]*a[k][j];
                    }

                }
            }
            System.out.println("Product is:");
            for(int i = 0; i < row1; i++){
                for(int j = 0; j < cow2; j++){
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}
