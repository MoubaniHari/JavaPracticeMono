package com.company;
import java.util.Scanner;
public class PatternChallenge2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = s.nextInt();
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(j + " ");
//            }
//            System.out.print("\n");
//        }

//        int c=0;
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                c++;
//                System.out.format("%02d ",c);
//            }
//            System.out.print("\n");
//        }

//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.format("* ");
//            }
//            System.out.print("\n");
//        }

        for(int i=1;i<=5;i++)
        {
            //int c=0;
            for(int j=1;j<=(5-i+1);j++)             //for(int j=5;j>=i;j--)
            {
                System.out.print(j + " ");
               // c++;
               // System.out.format(c + " ");
            }
            System.out.print("\n");
        }


    }
}
