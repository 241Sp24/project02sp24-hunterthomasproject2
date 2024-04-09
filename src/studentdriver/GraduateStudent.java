
package studentdriver;

public class GraduateStudent extends StudentFees{
    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String GraduateAssistantType;
    private double ADDITIONAL_FEES = 645.45;
    
    //constructor
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled){
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.GraduateAssistantType = graduateAssistantType;
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
        return super.toString() + "\nGraduate assistant:" + this.isGraduateAssistant + "\nGraduate assistant type: " + this.GraduateAssistantType + "\nCourses enrolled: " + this.coursesEnrolled + "\nPayable amount: " + getPayableAmount();
    }
}
