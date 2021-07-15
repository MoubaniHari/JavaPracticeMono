package com.company;
import java.util.Scanner;
public class MethodOverloading {
//    double area(double l,double b)
//    {
//        return l*b;
//    }
//    double area(double r)
//    {
//        return Math.PI*r*r;
//    }
//    public static void main(String[] args) {
//        Scanner s  = new Scanner(System.in);
//        MethodOverloading m = new MethodOverloading();
//        System.out.println("Enter the length and breadth of the rectangle: ");
//        int l = s.nextInt();
//        int b = s.nextInt();
//        System.out.println("The area of the rectangle is " + m.area(l,b));
//        System.out.println("Enter the radius of the circle: ");
//        int r = s.nextInt();
//        System.out.println("The area of the circle is " + m.area(r));


//    int reverse(int a)
//    {
//        int r=0;
//        while(a!=0)
//        {
//            int d = a%10;
//            a = a/10;
//            r = (r*10)+d;
//        }
//        return r;
//    }
//    void reverse(int A[],int n)
//    {
//        System.out.println("The reverse array is: ");
//        for(int i=n-1;i>=0;i--)
//        {
//            System.out.println(A[i]);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner s  = new Scanner(System.in);
//        MethodOverloading m = new MethodOverloading();
//        System.out.println("Enter a number: ");
//        int a = s.nextInt();
//        System.out.println("The reverse of the number is " + m.reverse(a));
//        System.out.println("Enter the number of elements of an array: ");
//        int n = s.nextInt();
//        int A[] = new int[50];
//        System.out.println("Enter the elements of array: ");
//        for(int i=0;i<n;i++)
//            A[i]=s.nextInt();
//        m.reverse(A,n);
//    }


    static  boolean validate(String name){
        return name.matches("[a-zA-Z//s]+");
    }
    static boolean validate(int age){
        return age>=3 && age<=15;
    }

    public static void main(String[] args) {
        System.out.println("Enter a name:");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println(validate(name));
        System.out.println("Enter an age:");
        int age = s.nextInt();
        System.out.println(validate(age));
    }
}
