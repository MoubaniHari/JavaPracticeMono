package com.company;
import java.util.Scanner;
public class PrimeNumber {
//    static boolean isPrime(int n)
//    {
//        for(int i=2;i<=n/2;i++)
//        {
//            if(n%i==0)
//                return false;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the number");
//        System.out.println(isPrime(s.nextInt()));
//    }

//    static int gcd(int m,int n)
//    {
//        while(m!=n){
//            if(m>n)
//                m = m-n;
//            else
//                n = n-m;
//        }
//        return m;
//    }
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the two numbers: ");
//        int m = s.nextInt();
//        int n = s.nextInt();
//        System.out.println("The gcd of two numbers is " + gcd(m,n));
//    }

    int maxElement(int A[],int n)
    {
        int max = A[0];
        for(int i=0;i<n;i++)
        {
            if(A[i]>=max)
                max = A[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();
        int A[] = new int[50];
        System.out.println("Enter the the array elements one by one: ");
        for(int i=0;i<n;i++)
        {
            A[i] = s.nextInt();
        };
        PrimeNumber pn = new  PrimeNumber();
        System.out.println("The maximum element of the array is " + pn.maxElement(A,n));
    }

}
