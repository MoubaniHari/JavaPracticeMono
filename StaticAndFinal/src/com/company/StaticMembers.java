package com.company;
class HondaCity{
    static int price = 1000000000;
    int y = 200;
    void display(){
        System.out.println(price+" "+y);
    }
    static void show(){
        System.out.println(price);
    }
}

public class StaticMembers {
    public static void main(String[] args) {
        System.out.println(HondaCity.price);
        HondaCity h1 = new HondaCity();
        h1.price = 2200000;
        h1.y = 7000;
        System.out.println(h1.price + " " + h1.y);
        HondaCity h2 = new HondaCity();
        System.out.println(h1.price + " " + h2.y);

    }
}
