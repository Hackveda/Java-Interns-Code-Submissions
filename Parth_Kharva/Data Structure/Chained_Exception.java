/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chainedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Parthkharva
 */
public class ChainedException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            System.out.println("-: Welcome To My Weight Checking Tool :-");
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Please Enter Your height in centimeters:");
            float height = sc.nextFloat();
            double idealweight = 50 + (0.91 * (height - 152.4));
            
            System.out.println("Your Ideal Weight Should be "+idealweight+" KG.");
        }
        catch(InputMismatchException e){
            throw new NumberFormatException();
        }
        finally{
            System.out.println("-: Thank You For Using My Tool :-");
        }
    }
    
}
