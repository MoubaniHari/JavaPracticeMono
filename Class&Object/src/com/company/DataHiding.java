package com.company;
import java.util.Scanner;
class account{
    private String name;
    private long accountNo;
    private double balance;
    public void setName(String n){
         name = n;
    }
    public String getName(){
        return name;
    }
    public void setAccountNumber(long a){
        accountNo = a;
    }
    public long getAccountNumber(){
        return accountNo;
    }
    public void setBalance(double b){
        balance = b;
    }
    public double getBalance(){
        return balance;
    }
    public double deposit(double amt1)
    {
        return balance + amt1;
    }
    public double withdraw(double amt2)
    {
        return balance - amt2;
    }
}
public class DataHiding {
    public static void main(String[] args) {
        account ac = new account();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the account holder name: ");
        ac.setName(s.nextLine());
        System.out.println("Enter the account number: ");
        ac.setAccountNumber(s.nextLong());
        s.nextLine();
        System.out.println("Enter the account balance: ");
        ac.setBalance(s.nextDouble());
        s.nextLine();
        System.out.println("Enter the amount you want to deposit: ");
        double amount1 = s.nextDouble();
        s.nextLine();
        System.out.println("Enter the amount you want to withdraw: ");
        double amount2 = s.nextDouble();
        System.out.println("Name : " + ac.getName());
        System.out.println("Account Number : " + ac.getAccountNumber());
        System.out.println("Account balance : " + ac.getBalance());
        System.out.println("The amount after depositing the amount : " + ac.deposit(amount1));
        System.out.println("The amount after withdraw the amount : " + ac.withdraw(amount2));
    }
}
