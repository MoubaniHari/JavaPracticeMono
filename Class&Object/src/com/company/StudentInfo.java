package com.company;
import java.util.Scanner;
class Student{
    public long roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int totalMarks()
    {
        return m1+m2+m3;
    }
    public double averageOfMarks(){
        return (double) totalMarks()/3;
    }
    public char grade()
    {
        double avg = averageOfMarks();
        if(avg>=90)
            return 'A';
        else if(avg >= 80 && avg < 90)
            return 'B';
        else if(avg >= 70 && avg < 80)
            return 'C';
        else if(avg >= 60 && avg < 70)
            return 'D';
        else if(avg >= 50 && avg < 60)
            return 'E';
        else if(avg < 50)
            return 'F';
        return 0;
    }
    public String toString()
    {
        return "\n"+"Roll No : "+roll+"\n"+"Name : "+name+"\n"+"Course : "+course+"\n";
    }
}
public class StudentInfo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name: ");
        s1.name = s.nextLine();
        System.out.println("Enter the roll: ");
        s1.roll = s.nextLong();
        s.nextLine();
        System.out.println("Enter the course: ");
        s1.course = s.nextLine();
        System.out.println("Enter the marks of the subjects: ");
        s1.m1 = s.nextInt();
        s1.m2 = s.nextInt();
        s1.m3 = s.nextInt();
//        System.out.println("Name : " + s1.name);
//        System.out.println("Roll : " + s1.roll);
//        System.out.println("Course : " + s1.course);
        System.out.println("Details : " + s1);
        System.out.println("Total marks : " + s1.totalMarks());
        System.out.println("Average of marks : " + s1.averageOfMarks());
        System.out.println("Grade : " + s1.grade());
    }
}
