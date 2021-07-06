package com.company;
import java.util.Scanner;
public class PatternChallenge1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = s.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=n;j++)
//            {
//                System.out.print(i + " ");
//            }
//            System.out.print("\n");
//        }

//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=n;j++)
//            {
//                System.out.print(i+j+ " ");
//            }
//            System.out.print("\n");
//        }

        int c=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                c++;
                System.out.format("%02d ",c);
            }
            System.out.print("\n");
        }

    }
}
