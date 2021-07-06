package com.company;
import java.util.Scanner;
public class PatternChallenge3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = s.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int k=1;k<=(i-1);k++)
//            {
//                System.out.print("  ");
//            }
//            for(int j=1;j<=(n-i+1);j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }

//        for(int i=1;i<n;i++)
//        {
//            for(int j=1;j<n;j++)
//            {
//                if(i<=j)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.print("\n");
//        }

//        for(int i=n;i>=1;i--)
//        {
//            for(int k=1;k<=(i-1);k++)
//            {
//                System.out.print("  ");
//            }
//            for(int j=1;j<=(n-i+1);j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }

//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                if(i+j>5)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.print("\n");
//        }

//        for(int i=1;i<=n;i++)
//        {
//            for(int k=1;k<=(5-i);k++)
//            {
//                System.out.print("  ");
//            }
//            for(int j=1;j<=(2*i-1);j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }

        for(int i=1;i<=n;i++) {
            if(i <= n / 2) {
                for (int k = 1; k <= (n/2 - i); k++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= (2*i-1); j++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int k = 1; k <= i-n/2; k++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= (2*(n-i)-1); j++) {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");

        }
    }
}
