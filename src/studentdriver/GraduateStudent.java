
package studentdriver;

/**
 *
 * @author s558312
 */
public class GraduateStudent extends StudentFees{
    private int coursesEnrolled;
    private boolean isGraduateAssitant;
    private String GraduateAssistantType;
    private double ADDITIONAL_FEES = 645.45;
    
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssitant, String GraduateAssitantType, int coursesEnrolled){
     super(studentName, studentID, isEnrolled, isGraduateAssitant, coursesEnrolled);  
    }
    
}
