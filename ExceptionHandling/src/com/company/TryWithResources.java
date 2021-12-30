package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class TryWithResources {
//    static FileInputStream fi;
//    static Scanner sc;
    static void divide() throws Exception {
        try(FileInputStream fi = new FileInputStream("/Users/banib/Documents/Text.txt");Scanner sc = new Scanner(fi)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / c);
        }
//        try {
//            fi = new FileInputStream("/Users/banib/Documents/Text.txt");
//            sc = new Scanner(fi);
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int c = sc.nextInt();
//            System.out.println(a / c);
////            fi.close();
////            sc.close();
//        }
//        finally {
//            fi.close();
//            sc.close();
//        }

    }

    public static void main(String[] args) {
        try{
            divide();
        }
        catch(Exception e){
            System.out.println(e);
        }
//        int x = sc.nextInt();
//        System.out.println(x);
    }
}
