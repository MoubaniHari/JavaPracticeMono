package com.company;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = s.nextInt();
        System.out.println("The multiplication table of the number is: ");
        for(int i =1;i <= 10;i++)
        {
            System.out.println(n + "*" + i + "=" + (n*i));
        }

//        int sum = 0;
//        for(int i = 1;i<=n;i++)
//        {
//             sum = sum + i;
//        }
//        System.out.println("The summation of n numbers is: " + sum);

//        long fact = 1;
//        for(int i=1;i<=n;i++)
//        {
//            fact = fact * i;
//        }
//        System.out.println("The factorial value of " + n + "is = " + fact);

    }
}
