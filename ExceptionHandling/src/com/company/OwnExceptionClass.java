package com.company;

import java.util.Scanner;

class LowBalanceException extends Exception{
    @Override
    public String toString() {
        return "The amount should not be less than 5000";
    }
}
public class OwnExceptionClass {
    static void printAmount(int n){
        try{
            if(n<5000)
                throw new LowBalanceException();
        }
        catch(LowBalanceException e)
        {
            System.out.println(e);
        }
        System.out.println("The amount is "+n);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int amount = s.nextInt();
        printAmount(amount);
    }
}
