package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
//	    System.out.println("Enter the number");
        System.out.println("Enter the numbers");
	    int a = s.nextInt();
	    int b = s.nextInt();
	    int c = s.nextInt();
//	    if(a >= 0)
//        {
//            System.out.println("Positive");
//        }
//	    else
//        {
//            System.out.println("Negative");
//        }

        if(a > b && a > c)
        {
            System.out.println("Greatest value is : " + a);
        }
        else if(b > c)
        {
            System.out.println("Greatest value is : " + b);
        }
        else
        {
            System.out.println("Greatest value is : " + c);
        }
    }
}
