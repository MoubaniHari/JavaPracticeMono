package com.company;

import java.util.Scanner;

public class MenuDrivenProgram
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("-----Menu-----");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter the two numbers");
        float a = s.nextFloat();
        float b = s.nextFloat();
        System.out.println("Enter the option");
        s.nextLine();
        String option = s.next();
        switch(option)
        {
            case "ADD": System.out.println("Addition of two numbers = " + (a+b));
                break;
            case "SUB": System.out.println("Subtraction of two numbers = " + (a-b));
                break;
            case "MUL": System.out.println("Multiplication of two numbers = " + (a*b));
                break;
            case "DIV": System.out.println("Division of two numbers = " + (a/b));
                break;
        }

    }
}


