package com.company;

public class NestedTryCatchBlock {
    public static void main(String[] args) {
        int[] myNumbers = {10,70,6,50,0};
        try{
            System.out.println((float)myNumbers[1]/myNumbers[3]);
            try {
                System.out.println(myNumbers[9]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index is Invalid");
            }
        }
        catch (ArithmeticException e){
            System.out.println("Denominator should not be 0");
        }
        System.out.println("Bye");
    }
}
