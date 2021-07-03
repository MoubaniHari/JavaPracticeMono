package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the coefficients: ");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    double d = (b*b - 4*a*c);
	    double r1,r2;
	    if(d == 0) {
	        r1 = -b/(2*a);
	        r2 = -b/(2*a);
            System.out.println("The roots are real and equal: " + r1 + " " + r2);
        }
	    else if(d > 0) {
	        r1 = (-b + Math.sqrt(d))/(2*a);
	        r2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("The roots are real and unequal: " + r1 + " " + r2);
        }
        else{
            System.out.println("The roots are unreal.");
        }
    }
}
