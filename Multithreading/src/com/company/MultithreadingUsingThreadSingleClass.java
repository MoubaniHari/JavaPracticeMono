package com.company;

public class MultithreadingUsingThreadSingleClass extends Thread{
    public void run(){
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        MultithreadingUsingThreadSingleClass m = new MultithreadingUsingThreadSingleClass();
        m.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }
    }
}
