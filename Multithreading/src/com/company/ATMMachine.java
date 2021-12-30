package com.company;
//class ATM{
//   synchronized public void checkBalance(String name)
//    {
//        System.out.println(name+" is checking balance");
//        try{Thread.sleep(1000);}catch(Exception e){}
//    }
//   synchronized public void withDraw(String name ,int amount){
//        System.out.println(name+" is withdrawing " + amount+ " amount");
//        try{Thread.sleep(1000);}catch(Exception e){}
//   }
//}
//class Customer extends Thread{
//    String name;
//    int amount;
//    ATM atm;
//    Customer(ATM atm,String name, int amount)
//    {
//        this.atm=atm;
//        this.name=name;
//        this.amount=amount;
//    }
//    public void run(){
//        atm.checkBalance(name);
//        atm.withDraw(name,amount);
//    }
//}
class ATM
{

    synchronized public void checkBalance(String name)
    {
        System.out.print(name + " Checking ");

        try{Thread.sleep(1000);}catch(Exception e){}

        System.out.println("Balance");
    }

    synchronized public void withDraw(String name,int amount)
    {
        System.out.print(name + " withdrawing ");

        try{Thread.sleep(1000);}catch(Exception e){}

        System.out.println(amount);

    }
}
class Customer extends Thread
{
    String name;
    int amount;
    ATM atm;

    Customer(String n,ATM a,int amt)
    {
        name=n;
        atm=a;
        amount=amt;
    }
    public void useATM()
    {
        atm.checkBalance(name);
        atm.withDraw(name, amount);
    }
    public void run()
    {
        useATM();
    }
}

public class ATMMachine {
    public static void main(String[] args) {
//        ATM atm=new ATM();
//        Customer c1=new Customer(atm,"Moubani Hari",1200);
//        Customer c2=new Customer(atm,"Srijani Hari",200);
//        Customer c3=new Customer(atm,"Rupam Hari",100);
//        c1.start();
//        c2.start();
//        c3.start();
        ATM atm=new ATM();
        Customer c1=new Customer("Smith",atm,100);
        Customer c2=new Customer("John",atm,200);
        c1.start();
        c2.start();
    }
}
