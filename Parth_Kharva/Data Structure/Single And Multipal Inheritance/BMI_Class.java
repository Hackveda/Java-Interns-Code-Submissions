/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package single_._multipal_inheritance;

/**
 *
 * @author Parthkharva
 */
public class BMI_Mechine_Result extends Single__multipal_inheritance{
    public static void main(String[] args){
        System.out.println(getMax_Heart_Rate(45));
    }
    public static int getMax_Heart_Rate(int age){
        System.out.println("This is the BMI Mechine Generated Heart Rate Result :");
        return 230 - age ;
    }
}
