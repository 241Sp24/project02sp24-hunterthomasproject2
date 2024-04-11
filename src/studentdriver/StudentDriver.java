/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdriver;
import java.util.*;
import java.io.*;
/**
 *
 * @author dianar
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Project02");
        
        StudentFees[] students = new StudentFees[12];
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of UG students: ");
        int UGS = input.nextInt();
        
        System.out.print("Enter the no of Graduate students: ");
        int GS = input.nextInt();
        
        System.out.print("Enter the no of online students: ");
        int OnS = input.nextInt();
        
        File inputFile = new File("input.csv");
        Scanner in = new Scanner(inputFile);
        
        int index = 0;
        
        int GSC = 0;
        int UGSC = 0;
        int OnSC = 0;
            
        while(in.hasNext() && index < students.length){
            String sp = in.nextLine();
            String[] split = sp.split(",");
            
            int id = Integer.parseInt(split[0]);
            String name = split[1];
            boolean enrolled = Boolean.parseBoolean(split[2]);
            int courseEn = Integer.parseInt(split[3]);
            
            if(id < 200){
                boolean HasSchol = Boolean.parseBoolean(split[4]);
                if(split.length < 5){
                    double schamt = Double.parseDouble(split[5]);
                    students[index] = new UGStudent(name, id, enrolled, HasSchol, schamt, courseEn);
                }
                students[index] = new UGStudent(name, id, enrolled, HasSchol, 0, courseEn);
                UGSC++;
                
            }
            else if(id < 300){
                boolean ga = Boolean.parseBoolean(split[4]);
                if(split.length < 5){
                    String at = split[5];
                    students[index] = new GraduateStudent(name, id, enrolled, ga, at, courseEn);
                }

                students[index] = new GraduateStudent(name, id, enrolled, ga, "", courseEn);
                GSC++;            
            }    
            else if(id < 400){
                int noOfM = Integer.parseInt(split[3]);
                students[index] = new OnlineStudent(name, id, enrolled, noOfM);
                OnSC++;
                
            }
            index++;
        }
        input.close();
        in.close();
        
        System.out.println("**********Undergraduate students list**********");
        for(StudentFees s : students){   
            if(s instanceof UGStudent){
                System.out.println(s);
                System.out.println();
            }
        }
        
        System.out.println("**********Graduate students list**********");
        for(StudentFees s : students){
            if(s instanceof GraduateStudent){
                System.out.println(s);
                System.out.println();
            }
        }
        
        System.out.println("**********Online students list**********");
        for(StudentFees s : students){
            if(s instanceof OnlineStudent){
                System.out.println(s);
                System.out.println();
            }
        }
        
        System.out.println("**********Undergraduate Students details**********");
        System.out.println();
        double cost = 0.;
        int scholarshipC = 0;
        int coursesC = 0;
        int count = 0;
        
        for(StudentFees s : students){
            if(s instanceof UGStudent){
                count += 1;
                cost += ((UGStudent) s).getPayableAmountt();
                if(((UGStudent) s).isHasScholarship() == true){
                    scholarshipC += 1;
                    coursesC += ((UGStudent) s).getCoursesEnrolled();
                }
            }
        }
        cost = cost / count;
        
        System.out.println("Average Students fee: " + cost +"\nScholarship count: " + scholarshipC + "\nTotal number of courses: " + coursesC);
        
        System.out.println();
        System.out.println("**********Graduate Students details**********");
        System.out.println();
        double cost2 = 0;
        int GAC2 = 0;
        int coursesC2 = 0;
        int count2 = 0;
        
        for(StudentFees s : students){
            if(s instanceof GraduateStudent){
                count2 += 1;
                cost2 += ((GraduateStudent) s).getPayableAmount();
                if(((GraduateStudent) s).isIsGraduateAssistant() == true){
                    GAC2 += 1;
                    coursesC2 += ((GraduateStudent) s).getCoursesEnrolled();
                }
            }
        }
        cost2 = cost2 / count2;
        System.out.println("Average Students fee: " + cost2 +"\nGraduate Assistantship count:  " + GAC2 + "\nTotal number of courses: " + coursesC2);
        
        
        System.out.println();
        System.out.println("**********Online Students details**********");
        System.out.println();
        double cost3 = 0;
        int count3 = 0;
        
        for(StudentFees s : students){
            if(s instanceof GraduateStudent){
                count3 += 1;
                cost3 += ((GraduateStudent) s).getPayableAmount();
            }
        }
        
        cost3 = cost3 / count3;
        System.out.println("Average Students fee: " + cost3);
    }

}
