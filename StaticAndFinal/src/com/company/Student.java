package com.company;
import java.util.*;
class Student1{
    private String rollNo;
    private String name;
    private String department;
    private String address;
    static private int count = 1;
    public void setDepartment(String department){
        this.department = department;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName(){
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getAddress() {
        return address;
    }

    static public String assignRollNo(){
        Date d = new Date();
        String roll = "Univ-" + (d.getYear()+1900) + "-" + count;
        count++;
        return roll;
    }

    public Student1(String name,String department,String address){
        rollNo = assignRollNo();
        this.name = name;
        setDepartment(department);
        setAddress(address);
    }

    public String toString(){
        return "\n Student Name:- "+name+"\n Roll No:- "+rollNo+"\n Department:- "+department+"\n Address:- "+address;
    }
}
public class Student {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Moubani Hari","CSE","Nabapolly Boys' School Road,Barasat");
        Student1 s2 = new Student1("Srijani Hari","ECE","Nabapolly Boys' School Road,Barasat");
        Student1 s3 = new Student1("Rupam Hari","EE","Nabapolly Boys' School Road,Barasat");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
