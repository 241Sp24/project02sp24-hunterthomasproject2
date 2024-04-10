package studentdriver;

public class UGStudent extends StudentFees{
    private double scholarshipAmount = 0.0;
    private int coursesEnrolled;
    private boolean hasScholarship = false;
    private double ADDITIONAL_FEE = 820.70;
    
    public UGStudent(String studentName, int studentID, boolean isEnrolled, boolean hasScholarship, double scholarshipAmount, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.hasScholarship = hasScholarship;
        this.scholarshipAmount = scholarshipAmount;
        this.coursesEnrolled = coursesEnrolled;
    }
    
    public boolean isHasScholarship(){
        return this.hasScholarship;
    }
    
    public double getScholarshipAmount(){
        return this.scholarshipAmount;
    }
    
    public int getCoursesEnrolled(){
        return this.coursesEnrolled;
    }
    
    public double getPayableAmountt(){
        return ((super.getPayableAmount()) + this.ADDITIONAL_FEE) - this.scholarshipAmount;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nScholarship: " + this.hasScholarship + "\nScholarship amount: " + this.scholarshipAmount + "\nCourses enrolled: " + this.coursesEnrolled + "\nPayable amount: " + getPayableAmountt();
    }
}
