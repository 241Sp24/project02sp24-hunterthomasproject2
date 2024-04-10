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
            
            if(id > 100){
                boolean HasSchol = Boolean.parseBoolean(split[4]);
                double schamt = Double.parseDouble(split[5]);
                students[index] = new UGStudent(name, id, enrolled, HasSchol, schamt, courseEn);
                UGSC++;
                
            }
            else if(id > 200){
                boolean ga = Boolean.parseBoolean(split[4]);
                String at = split[5];
                
                students[index] = new GraduateStudent(name, id, enrolled, ga, at, courseEn);
                GSC++;            
            }    
            else if(id > 300){
                int noOfM = Integer.parseInt(split[3]);
                students[index] = new OnlineStudent(name, id, enrolled, noOfM);
                OnSC++;
                
            }
            
        }
        input.close();
        in.close();
    }

}
