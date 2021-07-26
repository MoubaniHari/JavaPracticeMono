package com.company;
import java.util.Scanner;
class Rectangle1{
    public int length;
    public int breadth;
    int x = 10;
    public Rectangle1(int length,int breadth)
    {
       this.length = length;
       this.breadth = breadth;
    }
    void display(){
        System.out.println("Length of the rectangle is : " + this.length);
        System.out.println("Breadth of the rectangle is : " + this.breadth);
    }
}
class Cuboid extends Rectangle1{
    public int height;
    int x = 90;
    public Cuboid(int l,int b,int h)
    {
        super(l,b);
        height = h;
    }
    int volume(){
        return length*breadth*height;
    }
    void display(){
        System.out.println("Value of x variable of Parent class: " + super.x);
        System.out.println("Value of x variable of Child class: " + x);
    }
}
public class ThisSuper {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle: ");
        int l = s.nextInt();
        System.out.println("Enter the breadth of the Rectangle: ");
        int b = s.nextInt();
        Rectangle1 r1 = new Rectangle1(l,b);
        r1.display();
        System.out.println("Enter the length of the Rectangle: ");
        int l1 = s.nextInt();
        System.out.println("Enter the breadth of the Rectangle: ");
        int b1 = s.nextInt();
        Rectangle1 r2 = new Rectangle1(l1,b1);
        r2.display();

        Cuboid c = new Cuboid(5,3,10);
        c.display();
    }
}
