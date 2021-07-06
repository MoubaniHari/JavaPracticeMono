package com.company;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of terms: ");
        int n = s.nextInt();
//        System.out.println("Enter the first term: ");
//        int a = s.nextInt();
//        System.out.println("Enter the common difference: ");
//        int d = s.nextInt();
//        System.out.println("The AP series is : ");
//        int term = a;
//        for(int i = 0; i < n;i++)
//        {
//            if(i == 0)
//            {
//                System.out.print(term);
//            }
//            else
//            {
//                term = term + d;
//                System.out.print("+" + term);
//            }
//        }

//        System.out.println("The GP series is : ");
//        int term = a;
//        for(int i = 0; i < n;i++) {
//            if (i == 0) {
//                System.out.print(term);
//            } else {
//                term = term * d;
//                System.out.print("+" + term);
//            }
//        }

        int f0 = 0;
        int f1 = 1;
        System.out.println("The fibonacci series is: ");
        System.out.print(f0 + "+" + f1);
        int f2;
        for(int i = 3;i <= n;i++){
            f2 = f0 + f1;
            System.out.print("+" + f2);
            f0 = f1;
            f1 = f2;
        }

    }
}
