package com.company;
import java.util.Scanner;
class Rectangle{
    public int length;
    public int breadth;
    public Rectangle()
    {
        length=breadth=1;
    }
    public Rectangle(int l,int b)
    {
        length = l;
        breadth = b;
    }
}
class Cuboid1 extends Rectangle{
    public int height;
    public Cuboid1()
    {
        height = 1;
    }
    public Cuboid1(int h)
    {
        height = h;
    }
    public Cuboid1(int l,int b,int h)
    {
        super(l,b);
        height = h;
    }
    int volume(){
        return length*breadth*height;
    }
}

class Parent{
    public Parent(){
        System.out.println("Parent Class");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child Class");
    }
}
class GrandChild extends Child{
    public GrandChild(){
        System.out.println("Grand Child Class");
    }
}
public class ParamAndNonparamConstr {
    public static void main(String[] args) {
//        Cuboid1 c = new Cuboid1();
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the height of the cuboid: ");
//        int h = s.nextInt();
//        Cuboid1 c = new Cuboid1(h);
        System.out.println("Enter the length of the cuboid: ");
        int l = s.nextInt();
        System.out.println("Enter the breadth of the cuboid: ");
        int b = s.nextInt();
        System.out.println("Enter the height of the cuboid: ");
        int h = s.nextInt();
        Cuboid1 c = new Cuboid1(l,b,h);
        System.out.println("Volume of Cuboid is : " + c.volume());

        Parent p = new Parent();
        Child c1 = new Child();
        GrandChild g = new GrandChild();

    }
}
