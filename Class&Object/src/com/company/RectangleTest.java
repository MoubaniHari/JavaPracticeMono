package com.company;
import java.util.Scanner;
class Rectangle{
    public double length;
    public double breadth;
    public double area(){
        return length * breadth;
    }
    public double perimeter(){
        return 2 * (length+breadth);
    }
    public boolean isSquare(){
        return length == breadth;
//        if(length == breadth)
//            return true;
//        else
//            return false;
    }
}
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        r.length = s.nextDouble();
        System.out.println("Enter the breadth of the rectangle : ");
        r.breadth = s.nextDouble();
        System.out.println("The area of the rectangle is " + r.area());
        System.out.println("The perimeter of the rectangle is " + r.perimeter());
        System.out.println("Is it a Square - " + r.isSquare());
    }
}
