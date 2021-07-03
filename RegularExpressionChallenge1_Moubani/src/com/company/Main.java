package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        String str = s.nextLine();

//	    int b = s.nextInt();
//	    String str = String.valueOf(b);
//	    System.out.println(str.matches("[01]+"));
        //System.out.println(str.matches("[A-F0-9]+"));
        System.out.println(str.matches("(([0-2][0-9])|([3][01]))/(([0][0-9])|([1][012]))/[0-9]{4}"));
    }
}
