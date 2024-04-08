/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author s558312
 */
public abstract class StudentFees {
    private String studentName;
    private int studentID;
    private boolean isEnrolled;
    private int CREDITS_PER_COURSE = 3;
    private double PER_CREDIT_FEE = 543.50;
    
    public StudentFees(String studentName, int studentID, boolean isEnrolled){
        this.studentName = studentName;
        this.studentID = studentID;
        this.isEnrolled = isEnrolled;
    }
    
    public String getStudentName(){
        return this.studentName;
    }
    
    public int getStudentID(){
        return this.studentID;
    }
    
    public boolean isIsEnrolled(){
        return this.isEnrolled;
    }
    
    public int getCREDITS_PER_COURSE(){
        return this.CREDITS_PER_COURSE;
    }
    
    public double getPER_CREDIT_FEE(){
        return this.PER_CREDIT_FEE;
    }
    
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }
    
    public void setIsEnrolled(boolean isEnrolled){
        this.isEnrolled = isEnrolled;
    }
    
    public double getPayableAmount(){
        return this.PER_CREDIT_FEE * this.CREDITS_PER_COURSE;
    }
    
    public String toString(){
        return "Student name: " + this.studentName + "\nStudent id: " + this.studentID + "\nEnrolled: " + this.isEnrolled;
    }
}


