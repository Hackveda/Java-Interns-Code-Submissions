/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Parthkharva
 */

public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bank obj1 = new pnb();
        bank obj2 = new sbi();
        
        System.out.println("ROI :"+obj1.rate_of_interest());
        System.out.println("ROI :"+obj2.rate_of_interest());
    }
    
}
