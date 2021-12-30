package com.company;
class MyThread1 implements Runnable{
    public void run(){
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class MultithreadingUsingRunnableInterface {
    public static void main(String[] args) {
        MyThread1 m = new MyThread1();
        Thread t = new Thread(m);
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }
    }
}
