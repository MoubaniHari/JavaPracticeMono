package com.company;
//final class Test1{
//    final void show(){
//        System.out.println("Hello");
//    }
//}
//class Test2 extends Test1{
//    void show(){
//
//    }
//}
public class FinalMembers {
//    static final int R;
//    static
//    {
//        R = 10;                 //Static block
//    }

    final int R;
//
//    {
//        R = 10;                  //Instance block
//    }

    public FinalMembers(){
        R=10;
    }
    public static void main(String[] args) {
        final int R;
//        R= 10;
//        System.out.println(R);
    }
}
