package studentdriver;

public class UGStudent extends StudentFees{
    private double scholarshipAmount;
    private int courseEnrolled;
    private boolean hasScholarship;
    private double ADDITIONAL_FEE = 820.70;
    public UGStudent(String studentName, int studentID, boolean isEnrolled, boolean hasScholarship, double scholarshipAmount, int courseEnrolled) {
        super(studentName, studentID, isEnrolled);
    }
    
}
