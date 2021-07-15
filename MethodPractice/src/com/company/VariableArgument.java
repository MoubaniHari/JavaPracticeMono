package com.company;
import java.util.Scanner;

public class VariableArgument {
//    int max(int ...A) {
//        if (A.length == 0)
//            return Integer.MIN_VALUE;
//        int max = A[0];
//        for (int i = 1; i < A.length; i++) {
//            if (A[i] >= max)
//                max = A[i];
//        }
//        return max;
//    }

//    public static void main(String[] args) {
//        VariableArgument va = new VariableArgument();
//        System.out.println("The maximum number is " + va.max());
//        System.out.println("The maximum number is " + va.max(10,56,43,32,4));
//        System.out.println("The maximum number is " + va.max(10,56,43,32,40,600,4456));
//    }

//    int sum(int ...A)
//    {
//        int s = 0;
//        for(int i=0;i<A.length;i++)
//            s = s + A[i];
//        return s;
//    }
//
//    public static void main(String[] args) {
//        VariableArgument va = new VariableArgument();
//        System.out.println("The sum of numbers is " + va.sum());
//        System.out.println("The sum of numbers is " + va.sum(12,45,3,454,55,75));
//        System.out.println("The sum of numbers is " + va.sum(10,56,43,32,40,600,4456));
//    }

    double discount(double ...A)
    {
        double s = 0;
        for(int i=0;i<A.length;i++)
            s = s + A[i];
        if(s < 500)
            return s*0.10;
        else if (s >=500 && s < 1000)
            return s*0.15;
        else
            return s*0.20;
    }

    public static void main(String[] args) {
        VariableArgument va = new VariableArgument();
        System.out.println("The discounted amount is " + va.discount(12,45,3,454,55,75));
        System.out.println("The discounted amount is " + va.discount(10,56,43,32,40,600,4456));
    }
}
