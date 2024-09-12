/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nested._condition;

/**
 *
 * @author Parthkharva
 */
public class Nested_condition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name= "parth",surname="kharva";
        if(name == "parth"){
            if(surname == "jain"){
                System.out.println("your student record is available.");
            }
            else{
                System.out.println("your student "+name+" "+surname+"'s record is not available.");
            }
        }
        
    }
    
}
