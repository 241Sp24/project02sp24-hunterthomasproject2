/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdriver;
import java.util.*;
/**
 *
 * @author dianar
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Project02");
        
        StudentFees sf;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of UG students: : ");
        String UGS = input.nextLine();
        
        System.out.print("Enter the no of Graduate students: : ");
        String GS = input.nextLine();
        
        System.out.print("Enter the no of online students: : ");
        String OnS = input.nextLine();
    }

}
