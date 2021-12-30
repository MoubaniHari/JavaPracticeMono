package com.company;
import java.util.Scanner;
interface Member{
    void callBack();
}

class Store{
    Member mem[] = new Member[100];
    int count = 0;
    void register(Member m){
        mem[count++] = m;
    }
    void inviteSale(){
        for(int i=0;i<count;i++){
            mem[i].callBack();
        }
    }
}

class Customer implements Member{
    String name;
    public Customer(String name){
        this.name = name;
    }
    public void callBack(){
        System.out.println("Ok! I will visit !! " + "Customer - "+ name);
    }
}
public class CallBackMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of members: ");
        int n = s.nextInt();
        Store s1 = new Store();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the customer name: ");
            Customer c = new Customer(s.nextLine());
            s1.register(c);
            s1.inviteSale();
        }
    }
}