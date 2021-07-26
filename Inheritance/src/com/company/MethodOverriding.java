package com.company;
class Super{
    public void display(){
        System.out.println("Super class.");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("Sub class.");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();
        Sub s = new Sub();
        s.display();
    }
}
