/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package single_._multipal_inheritance;

import static single_._multipal_inheritance.BMI_Mechine_Result.getMax_Heart_Rate;

/**
 *
 * @author Parthkharva
 */
public class Single__multipal_inheritance {

    /**
     * @param args the command line arguments
     */
    public String maximum_heart_rate;
    public static void main(String[] args) {
        System.out.println(getMax_Heart_Rate(45));
    }
    public static int getMax_Heart_Rate(int age){
        int result = 0;
        result = 220 - age;
        System.out.print("This is the base class Generated Heart Rate Result :");
        return result;
    }
    
}
