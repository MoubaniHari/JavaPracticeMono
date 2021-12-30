package com.company;
import java.io.*;

public class CheckedUncheckedException {
    static void fun() throws FileNotFoundException {
        FileInputStream fi = new FileInputStream("My.txt");
    }
    static void fun1()
    {
        try{
            System.out.println(10/0);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
    }
    static void fun2()
    {
        fun1();
    }
    static void fun3()
    {
        fun2();
    }

    public static void main(String[] args) throws FileNotFoundException {
        fun();
        fun3();
    }
}
