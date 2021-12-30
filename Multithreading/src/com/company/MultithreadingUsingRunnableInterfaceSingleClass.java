package com.company;

public class MultithreadingUsingRunnableInterfaceSingleClass implements Runnable{
    public void run(){
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        MultithreadingUsingRunnableInterfaceSingleClass m = new MultithreadingUsingRunnableInterfaceSingleClass();
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
