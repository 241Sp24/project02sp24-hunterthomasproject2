/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author s558312
 */
public class GraduateStudent extends StudentFees{
    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistantType;
    private double ADDITIONAL_FEES = 654.45;
    
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled){
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.graduateAssistantType = graduateAssistantType;
        this.coursesEnrolled = coursesEnrolled;
    }
    
    public GraduateStudent (String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, int coursesEnrolled){
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.coursesEnrolled = coursesEnrolled;
    }
    
    public boolean isIsGraduateAssistant(){
        return this.isGraduateAssistant;
    }
    
    public int getCoursesEnrolled(){
        return this.coursesEnrolled;
    }
    
    @Override
    public double getPayableAmount(){
      return (super.getPayableAmount() + this.ADDITIONAL_FEES);
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nGraduate assistant:" + this.isGraduateAssistant + "\nGraduate assistant type: " + this.graduateAssistantType + "\nCourses enrolled: " + this.coursesEnrolled + "\nPayable amount: " + getPayableAmount();
    }
}
