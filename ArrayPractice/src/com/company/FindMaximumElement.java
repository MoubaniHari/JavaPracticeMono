package com.company;
import javax.management.openmbean.ArrayType;
import java.util.Scanner;
public class FindMaximumElement {
    public static void main(String[] args) {
//      Finding SUM of all elements:
//        System.out.println("Enter the number of elements: ");
//        Scanner s=new Scanner(System.in);
//        int n = s.nextInt();
//        System.out.println("Enter the elements of the array: ");
//        int A[]=new int[100];
//        for(int i=0; i<n; i++){
//            A[i]=s.nextInt();
//        }
//        int sum=0;
//        for(int i=0;i<n;i++){
//            sum=sum+A[i];
//        }
//        System.out.println("Sum is: "+sum);

//      Searching an element:
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the number of elements: ");
//        int n = s.nextInt();
//        System.out.println("Enter the elements one by one: ");
//        int[] A = new int[50];
//        for (int i = 0; i < n; i++) {
//            A[i] = s.nextInt();
//        }
//        System.out.println("Enter the element you want to search: ");
//        int b = s.nextInt();
//        for (int i = 0; i < n; i++) {
//            if (A[i] == b) {
//                System.out.println(b + " is found at " + i);
//                return;
//            }
//        }
//        System.out.println(b + " is not found");

//      Finding maximum element:
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the number of elements: ");
//        int n = s.nextInt();
//        System.out.println("Enter the elements one by one: ");
//        int[] A = new int[50];
//        for (int i = 0; i < n; i++) {
//            A[i] = s.nextInt();
//        }
//        int max=A[0];
//        for(int i = 0; i < n; i++){
//            if(A[i] >= max){
//                max=A[i];
//            }
//        }
//        System.out.println("Maximum Number is : "+max);

//        Finding second largest element:
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();
        System.out.println("Enter the elements one by one: ");
        int[] A = new int[50];
        for (int i = 0; i < n; i++) {
            A[i] = s.nextInt();
        }
        int temp;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (A[i] > A[j])
                {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        System.out.println("The second largest value is " + A[n-2]);
    }
}
