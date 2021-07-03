package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
//	    System.out.println("Enter the number");
//        System.out.println("Enter the age");
//	    int a = s.nextInt();
        System.out.println("Enter the marks of 3 subjects");
	    int m1 = s.nextInt();
	    int m2 = s.nextInt();
	    int m3 = s.nextInt();
//	    if(a % 2 == 0)
//        {
//            System.out.println("Number is even");
//        }
//	    else
//        {
//            System.out.println("Number is odd");
//        }

//        if(a >= 14 && a <= 55)
//        {
//            System.out.println("You are Young");
//        }
//        else
//        {
//            System.out.println("You are Not Young");
//        }

        float avg = (float)(m1+m1+m3)/ 3;
        if(avg >= 70)
        {
            System.out.println("Grade : 'A");
        }
        else if(avg >= 60 && avg < 70)
        {
            System.out.println("Grade : 'B");
        }
        else if(avg >= 50 && avg < 60)
        {
            System.out.println("Grade : 'C");
        }
        else if(avg >= 40 && avg < 50)
        {
            System.out.println("Grade : 'D");
        }
        else if(avg < 40)
        {
            System.out.println("Grade : 'F");
        }
    }
}
