package com.company;
import java.util.Scanner;
public class RotationOfArray {
    public static void main(String[] args) {
        //      Rotation of array:
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the number of elements: ");
//        int n = s.nextInt();
//        System.out.println("Enter the elements one by one: ");
//        int[] A = new int[50];
//        for (int i = 0; i < n; i++) {
//            A[i] = s.nextInt();
//        }
//        int x = A[0];
//        for(int i=0;i<n-1;i++)
//        {
//            A[i] = A[i+1];
//        }
//        A[n-1] = x;
//        System.out.println("Rotation of the array: ");
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(A[i]);
//        }

//        Insertion of an array element:
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the number of elements: ");
//        int n = s.nextInt();
//        System.out.println("Enter the elements one by one: ");
//        int[] A = new int[50];
//        for (int i = 0; i < n; i++) {
//            A[i] = s.nextInt();
//        }
//        System.out.println("Enter the value you want to insert:");
//        int x=s.nextInt();
//        System.out.println("Enter the index where you want to insert:");
//        int index=s.nextInt();
//        for(int i=n; i>=index; i--){
//            A[i+1]=A[i];
//        }
//        A[index]=x;
//        System.out.println("After inserting the new value,The array is:");
//        for(int i=0; i<=n; i++)
//            System.out.println(A[i]);

//        Deletion of an array element:
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();
        System.out.println("Enter the elements one by one: ");
        int[] A = new int[50];
        for (int i = 0; i < n; i++) {
            A[i] = s.nextInt();
        }
        System.out.println("Enter the index from where you want to delete:");
        int index=s.nextInt();
        for(int i=index; i<n; i++){
            A[i]=A[i+1];
        }
        System.out.println("After deleting the value,The array is:");
        for(int i=0; i<n-1; i++)
            System.out.println(A[i]);

    }
}
