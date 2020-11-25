package com.mycompany.lab5;
import java.util.*;
public class Course{
    Scanner sc = new Scanner(System. in );
    private String courseID;
    private String courseTitle;
    private double Credit;
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private int numberOfStudent;
    private Faculty faculty;
    
    
    // constractor
    public void Course(){     
    }
    public void Course( String courseID, String courseTitle, double Credit){   
    this.courseID = courseID;
    this.courseTitle = courseTitle;
    this.Credit = Credit;
    }
    
    // ID
    public String getcourseID(){
        return courseID;
    }
    public void setcourseID(String courseID){
        this.courseID = courseID;
    }
    // Title    
    public String getcourseTitle(){
        return courseTitle;
    }
    public void setcourseTitle(String courseTitle){
        this.courseTitle = courseTitle;
    }
    // Credit
    public double getCredit(){
        return Credit;
    }
    public void setCredit(double Credit){
        this.Credit = Credit;
    }
    public Faculty getFaculty(){
        return faculty;
    }
    public int getnumberOfStudent(){
        numberOfStudent = studentList.size();
        return numberOfStudent;
    }
    public int studentID(int i){
        return studentList.get(i).getstudentId();
    }
    
    // Display
    @Override
    public String toString(){
        return "Course Id:"+getcourseID()+"\nTitle:"+getcourseTitle()+"\nCredit:"+getCredit();
    }
    // Add Student
    public void addStudent(Student s){
        studentList.add(s);
        //System.out.println(studentList);
        //pass t1522
    }

    // Drop
    public void dropStudent(int studentId){
        for( int i = 0 ; i < studentList.size() ; i++ ){         
            if( studentId == studentList.get(i).getstudentId() ){
                studentList.remove(i);
            }
        }
    }
    // Add Faculty
    public void addFaculty(Faculty faculty){
        this.faculty = faculty;
    }
    // Drop Faculty
    public void dropFaculty(){
        this.faculty = null;
    }
    public void printStudentList(){
        numberOfStudent = studentList.size();
        System.out.println("Total Student:"+numberOfStudent+"\n"+studentList);
    }
}