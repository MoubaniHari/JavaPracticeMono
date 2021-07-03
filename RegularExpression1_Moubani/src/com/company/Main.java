package com.company;

public class Main {

    public static void main(String[] args) {
//	      String str1="f";
//        System.out.println(str1.matches("."));

//        String str1="a";//b,c
//        System.out.println(str1.matches("[abc]"));

//        String str1="%";//true for alphabets other than abc
//        System.out.println(str1.matches("[^abc]"));

//        String str1="v";
//        System.out.println(str1.matches("[abc][vz]"));

//        String str1="a";//A,a7
//        System.out.println(str1.matches("[a-zA-Z0-9]"));//[a-z[A-Z[0-9]]]//[a-z[A-Z][0-9]]

//        String str1="a7";
//        System.out.println(str1.matches("[a-z][0-9]"));

//        String str1="b";
//        System.out.println(str1.matches("a|b"));

//        String str1="ab";
//        System.out.println(str1.matches("ab"));

//        String str1="f";
//        System.out.println(str1.matches("[a-z&&[def]]"));// d,e or f

//        String str1="b";
//        System.out.println(str1.matches("[a-z&&[^bc]]"));//[ad-z]

//        String str1="q";
//        System.out.println(str1.matches("[a-z&&[^m-p]]"));//[a-lq-z]

//        String str1="b";
//        System.out.println(str1.matches("\\w"));

//        String str1="@";
//        System.out.println(str1.matches("\\W"));

//        String str1="5";
//        System.out.println(str1.matches("\\d"));

//        String str1="$";
//        System.out.println(str1.matches("\\D"));

//        String str1=" ";
//        System.out.println(str1.matches("\\s"));

        String str1=" ";
        System.out.println(str1.matches("\\S"));

    }
}
