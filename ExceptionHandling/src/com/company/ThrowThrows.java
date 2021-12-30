package com.company;

import java.util.Scanner;

class NegativeDimensionsException extends Exception {
    public String toString(){
        return "Dimensions cannot be negative.";
    }
}
class Rectangle{
    static int area(int l,int b)throws NegativeDimensionsException{
        if(l < 0 || b < 0)
            throw new NegativeDimensionsException();
        return l*b;
    }
}
public class ThrowThrows {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int b = s.nextInt();
        try{
            System.out.println("The area is " + Rectangle.area(l,b));
        }
        catch(NegativeDimensionsException e){
            System.out.println(e);
        }
    }
}
