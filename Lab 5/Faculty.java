package com.mycompany.lab5;

import java.util.*;

public class Faculty{
    Scanner sc = new Scanner(System. in );
    private int facultyId;
    private String facultyName;
    private String facultyPosition;
    
    // constractor
    public void Faculty(){     
    }
    public void Faculty( int facultytId, String facultyName,String facultyPosition){   
    }
    
    // ID
    public int getfacultyId(){
        return facultyId;
    }
    public void setfacultyId(int facultyId){
        this.facultyId = facultyId;
    }
    // Name    
    public String getfacultyName(){
        return facultyName;
    }
    public void setfacultyName(String facultyName){
        this.facultyName = facultyName;
    }
    // Position
    public String getfacultyPosition(){
        return facultyPosition;
    }
    public void setfacultyPosition(String facultyPosition){
        this.facultyPosition = facultyPosition;
    }
    // Display
    public String toString(){
        return "Faculty Id:"+getfacultyId()+"\nName:"+getfacultyName()+"\nPosition:"+getfacultyPosition();
    }    
}