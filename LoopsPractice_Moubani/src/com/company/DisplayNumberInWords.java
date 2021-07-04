package com.company;
import java.util.Scanner;
public class DisplayNumberInWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        StringBuilder str = new StringBuilder();
        while(n != 0)
        {
            int d = n % 10;
            n = n / 10;
            str.append(d);
        }
        for(int i=str.length()-1;i>=0;i--)
        {
            switch (str.charAt(i)) {
                case '0' -> System.out.print("Zero ");
                case '1' -> System.out.print("One ");
                case '2' -> System.out.print("Two ");
                case '3' -> System.out.print("Three ");
                case '4' -> System.out.print("Four ");
                case '5' -> System.out.print("Five ");
                case '6' -> System.out.print("Six ");
                case '7' -> System.out.print("Seven ");
                case '8' -> System.out.print("Eight ");
                case '9' -> System.out.print("Nine ");
            }
        }
    }
}
