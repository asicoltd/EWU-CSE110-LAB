package com.mycompany.lab5;

import java.util.*;

public class Student{
    Scanner sc = new Scanner(System. in );
    private int studentId;
    private String studentName;
    private double studentCGPA;
    
    // constractor
    public void Student(){     
    }
    public void Student( int studentId, String studentName, double studentCGPA){   
    }
    
    // ID
    public int getstudentId(){
        return studentId;
    }
    public void setstudentId(int studentId){
        this.studentId = studentId;
    }
    // Name    
    public String getstudentName(){
        return studentName;
    }
    public void setstudentName(String studentName){
        this.studentName = studentName;
    }
    // CGPA
    public double getstudentCGPA(){
        return studentCGPA;
    }
    public void setstudentCGPA(double studentCGPA){
        this.studentCGPA = studentCGPA;
    }
    // Display
        @Override
    public String toString(){
        return "student Id:"+getstudentId()+"\nName:"+getstudentName()+"\nCGPA:"+getstudentCGPA();
    }
}
