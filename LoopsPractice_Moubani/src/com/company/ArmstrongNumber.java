package com.company;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
//        while(n!=0)
//        {
//            int d = n % 10;
//            n = n / 10;
//            System.out.println(d);
//        }

//        int c = 0;
//        while(n!=0)
//        {
//            n = n / 10;
//            c++;
//        }
//        System.out.println("The number of digits are " + c);

//        int sum = 0;
//        int x = n;
//        while(n!=0)
//        {
//            int d = n % 10;
//            n = n / 10;
//            sum = sum + (d*d*d);
//        }
//        if(sum == x)
//        {
//            System.out.println("This is a armstrong number");
//        }
//        else
//        {
//            System.out.println("This is not a armstrong number");
//        }

        int rev = 0;
        while(n!=0)
        {
            int d = n % 10;
            n = n / 10;
            rev = (rev * 10) + d;
        }
        System.out.println("The reverse number is " + rev);

//        int rev = 0;
//        int x = n;
//        while(n!=0)
//        {
//            int d = n % 10;
//            n = n / 10;
//            rev = (rev * 10) + d;
//        }
//        if(rev == x)
//        {
//            System.out.println("This is a palindrome number");
//        }
//        else
//        {
//            System.out.println("This is not a palindrome number");
//        }
    }
}
