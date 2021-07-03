package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the sides of the triangle: ");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    float s = (a+b+c)/2;
	    double  area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
	    System.out.print("Area of the triangle: " + area);
    }
}
