/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulation;

/**
 *
 * @author Parthkharva
 */

class ab{
 private int a = 85;
 public int xy = 41;
 
}
public class Encapsulation extends ab{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Encapsulation obj =new  Encapsulation();
        System.out.println("xy="+obj.xy);
        System.out.println("a="+obj.a);
    }
    
}
