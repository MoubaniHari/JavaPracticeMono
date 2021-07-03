package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the length,breadth and height of the cuboid");
	    int length = sc.nextInt();
        int breadth = sc.nextInt();
        int height = sc.nextInt();
        int area = 2*((length * breadth) + (length * height) + (breadth * height));
        int volume = length * breadth * height;
        System.out.println("area of the cuboid is " + area);
        System.out.println("Volume of the cuboid is " + volume);
    }
}
