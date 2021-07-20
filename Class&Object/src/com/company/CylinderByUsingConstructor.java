package com.company;
import java.util.Scanner;
class Cylinder1{
    private double radius;
    private double height;
    public void setRadius(double r)
    {
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public void setHeight(double h)
    {
        height = h;
    }
    public double getHeight(){
        return height;
    }
    public Cylinder1(){
        radius = 1;
        height = 1;
    }
    public Cylinder1(double r,double h){
        setRadius(r);
        setHeight(h);
    }
    public Cylinder1(double r){
        setRadius(r);
        setHeight(r);
    }
    public double lidArea(){
        return Math.PI * radius * radius;
    }
    public double circumference(){ return 2 * Math.PI * radius; }
    public double totalSurfaceArea(){
        return 2 * Math.PI * radius * (height + radius);
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}
public class CylinderByUsingConstructor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radi = s.nextDouble();
        System.out.println("Enter the height of the cylinder : ");
        double heit = s.nextDouble();
//        Cylinder1 c = new Cylinder1();
//        Cylinder1 c = new Cylinder1(radi,heit);
        Cylinder1 c = new Cylinder1(radi);
        System.out.println("The lid area of the cylinder is "+c.lidArea());
        System.out.println("The circumference of the cylinder is "+c.circumference());
        System.out.println("The total surface area of the cylinder is "+c.totalSurfaceArea());
        System.out.println("The volume of the cylinder is "+c.volume());
    }
}
