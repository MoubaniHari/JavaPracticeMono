package com.company;
import java.util.Scanner;

abstract class Shape{
    abstract public double area();
    abstract public double perimeter();
}

class Circle extends Shape{
    private double radius;
    public void setRadius(double radius){
        this.radius = radius;
    }
    public Circle(double radius){
        setRadius(radius);
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}

class Rectangle extends Shape{
    private double length;
    private double breadth;

    public void setLength(double length) {
        this.length = length;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    public Rectangle(double length,double breadth){
        setLength(length);
        setBreadth(breadth);
    }
    public double area() {
        return length*breadth;
    }
    public double perimeter() {
        return 2*(length+breadth);
    }
}
public class ShapeCircleRectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = s.nextDouble();
        Circle c = new Circle(radius);
//        System.out.println("The area of the circle is " + c.area());
//        System.out.println("The perimeter of the circle is " + c.perimeter());

        Shape sh1 = c;
//        Shape sh1 = new Circle(radius);
        System.out.println("The area of the rectangle is " + sh1.area());
        System.out.println("The perimeter of the rectangle is " + sh1.perimeter());

        System.out.println("Enter the length: ");
        double length = s.nextDouble();
        System.out.println("Enter the breadth: ");
        double breadth = s.nextDouble();
        Rectangle r = new Rectangle(length,breadth);
//        System.out.println("The area of the rectangle is " + r.area());
//        System.out.println("The perimeter of the rectangle is " + r.perimeter());

        Shape sh = r;
//        Shape sh = new Rectangle(length,breadth);
        System.out.println("The area of the rectangle is " + sh.area());
        System.out.println("The perimeter of the rectangle is " + sh.perimeter());
    }
}