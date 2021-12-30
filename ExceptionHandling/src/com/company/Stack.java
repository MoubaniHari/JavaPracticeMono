package com.company;

import java.util.Scanner;

class StackOverFlow extends Exception{
    public String toString(){
        return "Stack is Overflow";
    }
}
class StackUnderFlow extends Exception{
    public String toString(){
        return "Stack is Underflow";
    }
}
class Stack1{
    private int size;
    private int top=-1;
    private int stack[];
    public Stack1(int size)
    {
        this.size=size;
        stack = new int[size];
    }
    public void push(int num)throws StackOverFlow{
        if(top == size-1)
            throw new StackOverFlow();
        top++;
        stack[top]=num;
    }
    public int pop()throws StackUnderFlow{
        int x;
        if(top == -1)
            throw new StackUnderFlow();
        x=stack[top];
        top--;
        return x;
    }
}
public class Stack {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = s.nextInt();
        Stack1 st = new Stack1(n);
        int option = 0;
        while (option != 3) {
            System.out.println("----- Menu -----");
            System.out.println("1. Push into the Stack: ");
            System.out.println("2. Pop from the Stack: ");
            System.out.println("3. Exit");
            System.out.println("Enter the option: ");
            option = s.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the data: ");
                    int d = s.nextInt();
                    try {
                        st.push(d);
                    }
                    catch(StackOverFlow e){
                        System.out.println(e);
                     }
                    break;
                case 2:
                    try {
                        System.out.println("The deleted element is "+st.pop());
                    }
                    catch(StackUnderFlow e)
                    {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }
    }
}
