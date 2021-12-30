package com.company;
//abstract class My{
//    abstract public void display();
//}
interface My{
    public void display();
}
class Outer3{
    public void meth(){
        My m = new My() {
            public void display() {
                System.out.println("Hello");
            }
        };
        m.display();
//        new My(){public void display() { System.out.println("Hello"); }}.display();
    }
}
public class AnonymousInnerClasses {
    public static void main(String[] args) {
        Outer3 o = new Outer3();
        o.meth();
    }
}
