package com.company;
class MyData{
   synchronized public void display(String str){
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
            try{Thread.sleep(100);}catch(Exception e){}
        }
    }
}
class MyThread2 extends Thread{
    MyData d;
    MyThread2(MyData d){this.d=d;}
    public void run() {
        d.display("Hello World");
    }
}
class MyThread3 extends Thread{
    MyData d;
    MyThread3(MyData d){this.d=d;}
    public void run() {
        d.display("Welcome");
    }
}
public class Synchronisation {
    public static void main(String[] args) {
        MyData d=new MyData();
        MyThread2 t1=new MyThread2(d);
        MyThread3 t2=new MyThread3(d);
        t1.start();
        t2.start();
    }
}
