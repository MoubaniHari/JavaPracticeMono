package com.company;
import java.util.Scanner;

class Circle{
    public double radius;
    public double area()
    {
        return Math.PI * radius * radius;
    }
    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        c1.radius = s.nextDouble();
        System.out.println("The area of the circle is " + c1.area());
        System.out.println("The perimeter of the circle is " + c1.perimeter());
        System.out.println("The circumference of the circle is " + c1.circumference());
    }
}
