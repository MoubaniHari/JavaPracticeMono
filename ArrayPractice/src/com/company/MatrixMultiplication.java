package com.company;

import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
//        Addition of two matrices:
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the no. of rows of two matrices:");
//        int r=s.nextInt();
//        System.out.println("Enter the no. of columns of two matrices:");
//        int c=s.nextInt();
//        System.out.println("Enter the elements one by one of 1st matrix: ");
//        int A[][] = new int[50][50];
//        for(int i=0;i<r;i++){
//            for (int j = 0; j < c; j++) {
//                A[i][j] = s.nextInt();
//            }
//        }
//        System.out.println("1st matrix is:");
//        for(int i=0;i<r;i++){
//            for (int j = 0; j < c; j++) {
//                System.out.print(A[i][j]+" ");
//            }
//            System.out.printf("\n");
//        }
//        System.out.println("Enter the elements one by one of 2nd matrix: ");
//        int B[][] = new int[50][50];
//        for(int i=0;i<r;i++){
//            for (int j = 0; j < c; j++) {
//                B[i][j]=s.nextInt();
//            }
//        }
//        System.out.println("2nd matrix is:");
//        for(int i=0;i<r;i++){
//            for (int j = 0; j < c; j++) {
//                System.out.print(B[i][j]+" ");
//            }
//            System.out.printf("\n");
//        }
//        int C[][]= new int[50][50];
//        for(int i=0;i<r;i++){
//            for (int j = 0; j < c; j++) {
//                C[i][j]=A[i][j]+B[i][j];
//            }
//        }
//        System.out.println("Addition of 2 matrices");
//        for(int i=0;i<r;i++){
//            for (int j = 0; j < c; j++) {
//                System.out.print(C[i][j]+" ");
//            }
//            System.out.printf("\n");
//        }

//       Multiplication of two matrices:
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the no. of rows and no. of columns of 1st matrix:");
//        int r1=s.nextInt();
//        int c1=s.nextInt();
//        System.out.println("Enter the no. of rows and no. of columns of 2nd matrix:");
//        int r2=s.nextInt();
//        int c2=s.nextInt();
//        if(c1!=r2)
//            System.out.println("Matrices can't be multiplied");
//        else {
//            System.out.println("Enter the elements one by one of 1st matrix: ");
//            int A[][] = new int[50][50];
//            for (int i = 0; i < r1; i++) {
//                for (int j = 0; j < c1; j++) {
//                    A[i][j] = s.nextInt();
//                }
//            }
//            System.out.println("1st matrix is:");
//            for (int i = 0; i < r1; i++) {
//                for (int j = 0; j < c1; j++) {
//                    System.out.print(A[i][j] + " ");
//                }
//                System.out.printf("\n");
//            }
//            System.out.println("Enter the elements one by one of 2nd matrix: ");
//            int B[][] = new int[50][50];
//            for (int i = 0; i < r2; i++) {
//                for (int j = 0; j < c2; j++) {
//                    B[i][j] = s.nextInt();
//                }
//            }
//            System.out.println("2nd matrix is:");
//            for (int i = 0; i < r2; i++) {
//                for (int j = 0; j < c2; j++) {
//                    System.out.print(B[i][j] + " ");
//                }
//                System.out.printf("\n");
//            }
//            int C[][] = new int[50][50];
//            for (int i = 0; i < r1; i++) {
//                for (int j = 0; j < c2; j++) {
//                    C[i][j] = 0;
//                    for (int k = 0; k < c1; k++)
//                        C[i][j] = C[i][j] + (A[i][k] * B[k][j]);
//                }
//            }
//            System.out.println("Multiplication of 2 matrices");
//            for (int i = 0; i < r1; i++) {
//                for (int j = 0; j < c2; j++) {
//                    System.out.print(C[i][j] + " ");
//                }
//                System.out.printf("\n");
//            }
//        }

//        Sorting array of strings
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements one by one: ");
        String A[] = { "java","addition","Fly","fly","error"};
        java.util.Arrays.sort(A);
        for(String x : A)
        {
            System.out.println(x);
        }
    }
}
