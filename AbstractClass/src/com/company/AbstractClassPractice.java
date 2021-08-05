package com.company;
abstract class Kfc{
    public Kfc(){
        System.out.println("Kfc Shop");
    }
    public void makeItem(){
        System.out.println("Chicken nuggets,Chicken Wings,Coke");
    }
    abstract public void billing();
    abstract public void offer();
}
class MyKfc extends Kfc{
    public MyKfc(){
        System.out.println("MyKfc Shop");
    }
    public void billing(){
        System.out.println("Billing is different from Kfc");
    }
    public void offer(){
        System.out.println("Offer is different from Kfc");
    }
    public void festiveOffer(){
        System.out.println("Festive offer is included");
    }
}
public class AbstractClassPractice {
    public static void main(String[] args) {
        Kfc k = new MyKfc();
//      MyKfc k = new MyKfc();
        k.makeItem();
        k.billing();
        k.offer();
//      k.festiveOffer();
    }
}
