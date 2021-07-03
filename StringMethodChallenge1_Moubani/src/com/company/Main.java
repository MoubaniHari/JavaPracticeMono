package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter your mail-id");
        String str=s.nextLine();
        int i=str.indexOf("@");
        String username=str.substring(0,i);
        String domain=str.substring(i+1,str.length());
        System.out.println("Username = " + username);
        System.out.println("Domain = " + domain);

        System.out.println(domain.contains("gmail"));

//		System.out.println(domain.startsWith("gmail"));

//    	int j = str.indexOf(".",i);
//    	String str1 = str.substring(i+1,j);
//    	System.out.println(str1.equals("gmail"));
    }
}
