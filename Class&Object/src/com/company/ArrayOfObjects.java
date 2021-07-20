package com.company;
import java.util.Arrays;
import java.util.Scanner;
class Subject{
    private String subId;
    private String subName;
    private int maxMarks;
    private int marksObtain;

    public String getSubId(){ return  subId;}
    public String getSubName(){ return subName;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtain(){return marksObtain;}

    public void setMaxMarks(int maxMarks1){
        maxMarks = maxMarks1;
    }
    public void setMarksObtain(int marksObtain1){
        marksObtain = marksObtain1;
    }

    public Subject(String subId1,String subName1){
        subId = subId1;
        subName = subName1;
    }
    public Subject(String subId1,String subName1,int maxMarks1){
        subId = subId1;
        subName = subName1;
        maxMarks = maxMarks1;
    }
    public Subject(String subId1,String subName1,int maxMarks1,int marksObtain1){
        subId = subId1;
        subName = subName1;
        maxMarks = maxMarks1;
        marksObtain = marksObtain1;
    }
    boolean isQualified(){
        return marksObtain >= maxMarks/10*4;
    }
    public String toString(){
        return"\n SubjectID: "+subId+"\n Name: "+subName+ "\n MaximumMarks: " +maxMarks+ "\n MarksObtained: "+marksObtain;
    }
}

class Student1{
    private String studentName;
    private String studentRoll;
    private String studentDept;
    private String[] deptSubjects = new String[50];

    public String getStudentName(){ return  studentName;}
    public String getStudentRoll(){ return studentRoll;}
    public String getStudentDept(){return studentDept;}
    public String[] getDeptSubjects() {
        return deptSubjects;
    }

    public void setStudentDept(String studentDept1){
        studentDept = studentDept1;
    }
    public void setDeptSubjects(String[] deptSubjects) {
        this.deptSubjects = deptSubjects;
    }

    public Student1(String studentName1,String studentRoll1){
        studentName = studentName1;
        studentRoll = studentRoll1;
    }
    public Student1(String studentName1,String studentRoll1,String studentDept1){
        studentName = studentName1;
        studentRoll = studentRoll1;
        studentDept = studentDept1;
    }
    public Student1(String studentName1,String studentRoll1,String studentDept1,String... deptSubjects){
        studentName = studentName1;
        studentRoll = studentRoll1;
        setStudentDept(studentDept1);
        setDeptSubjects(deptSubjects);
    }
    public String toString(){
        return"\n Student Name: "+studentName+"\n Roll: "+studentRoll+ "\n Department: " +studentDept+ "\n Subjects: "+ Arrays.toString(deptSubjects);
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Subject subs[] = new Subject[3];
        subs[0] = new Subject("CS302","DS",90,78);
        subs[1] = new Subject("CS402","Algorithm",100);
        subs[2] = new Subject("CS502","Operating System");
        for(Subject s : subs)
        {
            System.out.println(s);
        }

        Student1 stud[] = new Student1[3];
        stud[0] = new Student1("Moubani Hari","71","CSE","DBMS","Operating System");
        stud[1] = new Student1("Srijani Hari","30","CSE","Algorithm","DS");
        stud[2] = new Student1("Rupam Hari","17","CSE","Numerical Methods","Java");
        for(Student1 s1 : stud)
        {
            System.out.println(s1);
        }
    }
}
