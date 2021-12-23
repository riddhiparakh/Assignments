package com.Riddhi;
 //Riddhi J073
//Print a  Right triangle pattern
public class pattern {



        public static void main(String[]args){
            int i, j, nrow=8;

            for(i=0; i<nrow; i++)
            {

                for(j=0; j<=i; j++)
                {

                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }


