/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditions;

/**
 *
 * @author Parthkharva
 */
public class Conditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 90;
        if(i>80 && i<=100){
            System.out.println("Your selected number is in the range of 81 to 100");
        }
        else if(i>40 && i<=80){
            System.out.println("Your selected number is in the range of 41 to 80");
        }
        if(i>0 && i<=40){
            System.out.println("Your selected number is in the range of 1 to 40");
        }
        else if(i>100){
            System.out.println("Your selected number is above 100 ");
        }
    }
    
}
