package com.company;
import java.util.Scanner;

public class IncreasingSizeOfArray {
    public static void main(String[] args) {
//       Coping an array:
//         Scanner s=new Scanner(System.in);
//         System.out.println("Enter the number of elements:");
//         int n=s.nextInt();
//         System.out.println("Enter the elements one by one:");
//         int[] A = new int[50];
//         for (int i = 0; i < n; i++) {
//            A[i] = s.nextInt();
//        }
//        int k=0;
//        int[] B=new int[50];
//        for(int i=0; i<n; i++){
//            B[k++]=A[i];
//        }
//        System.out.println("After coping the array,the new array is:");
//        for(k=0; k<n; k++){
//            System.out.println(B[k]);
//        }

//        Reverse copying an array
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the number of elements: ");
//        int n = s.nextInt();
//        System.out.println("Enter the elements oe by one: ");
//        int A[] = new int[50];
//        for(int i=0;i<n;i++)
//        {
//            A[i] = s.nextInt();
//        }
//        int B[] = new int[50];
//        for(int i=n-1,k=0;i>=0;i--,k++)
//        {
//            B[k] = A[i];
//        }
//        System.out.println("The reverse array is: ");
//        for(int k=0;k<n;k++){
//            System.out.println(B[k]);
//        }

//      Reverse copying an array
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();
        System.out.println("Enter the elements one by one: ");
        int A[] = new int[n];
        for(int i=0;i<n;i++)
        {
            A[i] = s.nextInt();
        }
        int B[] = new int[2*A.length];
        for(int i=0;i<n;i++)
        {
            B[i] = A[i];
        }
        A=B;
        B=null;
        System.out.println("The new array is: ");
        for(int i=0;i<n;i++){
            System.out.println(A[i]);
        }
        System.out.println("The size of array:");
        System.out.println(A.length);
    }
}
