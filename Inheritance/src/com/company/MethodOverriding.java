package com.company;
class Car{
    public void start(){
        System.out.println("Car is started.");
    }
    public void accelerate(){
        System.out.println("Car is accelerated.");
    }
    public void gearChange(){
        System.out.println("Car gear changed.");
    }
}
class LuxuryCar extends Car{
    public void gearChange(){
        System.out.println("Automatically gear changed.");
    }
    public void openRoof(){
        System.out.println("Roof is opened.");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        LuxuryCar l = new LuxuryCar();
        l.start();
        l.accelerate();
        l.gearChange();
        l.openRoof();
    }
}