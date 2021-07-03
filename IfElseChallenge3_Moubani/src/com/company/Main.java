package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the day: ");
//        int day = s.nextInt();
//        if (day == 1) {
//            System.out.println("Today is Monday");
//        }
//        else if (day == 2) {
//            System.out.println("Today is Tuesday");
//        }
//        else if (day == 3) {
//            System.out.println("Today is Wednesday");
//        }
//       else if (day == 4) {
//            System.out.println("Today is Thursday");
//        }
//       else if (day == 5) {
//            System.out.println("Today is Friday");
//        }
//       else if (day == 6) {
//            System.out.println("Today is Saturday");
//        }
//       else if (day == 7) {
//            System.out.println("Today is Sunday");
//        }
//       else {
//            System.out.println("Invalid day number");
//        }

       System.out.println("Enter the url: ");
       String url = s.nextLine();
       int i = url.indexOf(":");
       String str1 = url.substring(0,i);
       if(str1.equals("http"))
       {
           System.out.println("Hyper Text Transfer Protocol");
       }
       else if(str1.equals("ftp"))
       {
            System.out.println("File Transfer Protocol");
       }

       int j = url.lastIndexOf(".");
       String str2 = url.substring(j+1,url.length());
       if(str2.equals("com"))
       {
           System.out.println("Commercial Site");
       }
       else if(str2.equals("org"))
       {
            System.out.println("Organization Site");
       }
       else if(str2.equals("net"))
       {
            System.out.println("Network Site");
       }

    }
}