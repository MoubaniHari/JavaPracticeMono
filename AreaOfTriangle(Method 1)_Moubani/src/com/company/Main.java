package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        float base = sc.nextFloat();
        System.out.println("Enter the height of the triangle: ");
        float height = sc.nextFloat();
        float z = base * height / 2;
        System.out.println("The area of the triangle: " + z);
    }
}
