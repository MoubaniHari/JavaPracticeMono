package com.company;
import java.util.Scanner;
class Rectangle1{
    public double length;
    public double breadth;

    public Rectangle1()
    {
        length = 1;
        breadth = 1;
    }
    public Rectangle1(double l,double b)
    {
        length = l;
        breadth = b;
    }
    public Rectangle1(double s)
    {
        length = breadth = s;
    }
    public double area(){
        return length * breadth;
    }
    public double perimeter(){
        return 2 * (length+breadth);
    }
    public boolean isSquare(){
        return length == breadth;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        double len = s.nextDouble();
        System.out.println("Enter the breadth of the rectangle : ");
        double brea = s.nextDouble();
//        Rectangle1 r = new Rectangle1();
//        Rectangle1 r = new Rectangle1(len,brea);
        Rectangle1 r = new Rectangle1(len);
        System.out.println("The area of the rectangle is " + r.area());
        System.out.println("The perimeter of the rectangle is " + r.perimeter());
        System.out.println("Is it a Square - " + r.isSquare());
    }
}
