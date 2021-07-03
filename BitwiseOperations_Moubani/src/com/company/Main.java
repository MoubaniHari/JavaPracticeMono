package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 0b1001;
        int b = 0b1100;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));

        /*byte x = 0b0101;
        byte y = 0b1001;
        byte c = (byte)(y << 4);
        c = (byte)(x | c);
        System.out.println((c & 0b11110000)>>4);
        System.out.println(c & 0b00001111);*/

    }
}
