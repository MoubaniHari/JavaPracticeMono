package com.company;
import java.util.Scanner;
class Account{
    private String accNo;
    private String accName;
    private String address;
    private String phNo;
    private String dob;
    protected double balance;

    public String getAccNo(){return accNo;}
    public String getAccName(){return accName;}
    public String getAddress(){return address;}
    public String getPhNo(){return phNo;}
    public String getDob(){return dob;}
    public double getBalance(){return balance;}

    public void setAddress(String add)
    {
        address = add;
    }
    public void setPhNo(String phNo1)
    {
        phNo = phNo1;
    }

    public Account(String acc,String name,String add,String phNo,String dob)
    {
        accNo = acc;
        accName = name;
        setAddress(add);
        setPhNo(phNo);
        this.dob = dob;
        balance = 0;
    }
    public String toString(){
        return "\n Account Number: "+accNo+"\n Account Holder Name: "+accName+"\n Account Holder Address: "+address+"\n Account Holder Phone Number: "+phNo+"\n Acoount Holder DOB: "+dob;
    }
}
class SavingsAccount extends Account
{
    public SavingsAccount(String acc, String name, String add, String phNo, String dob) {
        super(acc, name, add, phNo, dob);
    }

    public void deposit(double amt)
    {
        balance +=amt;
    }
    public void withdraw(double amt)
    {
        balance -=amt;
    }
}

class LoanAccount extends Account
{
    public LoanAccount(String acc, String name, String add, String phNo, String dob) {
        super(acc, name, add, phNo, dob);
    }

    public void payEMI(double amt)
    {
        balance -= amt;
    }
    public void rePay(double amt)
    {
        if(balance==amt)
            balance = 0;
    }
}
public class AccountCustomer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        String acc = s.nextLine();
        System.out.println("Enter the account holder name: ");
        String name = s.nextLine();
        System.out.println("Enter the account holder address: ");
        String add = s.nextLine();
        System.out.println("Enter the account holder phone number: ");
        String phNo = s.nextLine();
        System.out.println("Enter the account holder date of birth: ");
        String dob = s.nextLine();
        SavingsAccount sa = new SavingsAccount(acc,name,add,phNo,dob);
        System.out.println("Enter the amount you want to deposit: ");
        sa.deposit(s.nextDouble());
        System.out.println(sa);
        System.out.println(" Current balance is: " + sa.getBalance());
        System.out.println("Enter the amount you want to withdraw: ");
        sa.withdraw(s.nextDouble());
        System.out.println(sa);
        System.out.println(" Current balance is: " + sa.getBalance());

        s.nextLine();
        System.out.println("Enter the account number: ");
        String acc1 = s.nextLine();
        System.out.println("Enter the account holder name: ");
        String name1 = s.nextLine();
        System.out.println("Enter the account holder address: ");
        String add1 = s.nextLine();
        System.out.println("Enter the account holder phone number: ");
        String phNo1 = s.nextLine();
        System.out.println("Enter the account holder date of birth: ");
        String dob1 = s.nextLine();
//        LoanAccount la = new LoanAccount(acc,name,add,phNo,dob);
        LoanAccount la = new LoanAccount(acc1,name1,add1,phNo1,dob1);
        System.out.println("Enter the amount you have to pay as EMI: ");
        la.payEMI(s.nextDouble());
        System.out.println(la);
        System.out.println(" Current balance is: " + la.getBalance());
        System.out.println("Enter the amount you want to repay: ");
        la.rePay(s.nextDouble());
        System.out.println(la);
        System.out.println(" Current balance is: " + la.getBalance());


    }
}
