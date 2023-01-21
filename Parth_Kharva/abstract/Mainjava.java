/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstract_method;

/**
 *
 * @author Parthkharva
 */
public class Abstract_method extends abstract_class{

    /**
     * @param args the command line arguments
     */
    public void method2(){
        System.out.println("hello ji");
    }
    public static void main(String[] args) {
        abstract_class ab = new Abstract_method();
        ab.method2();
        ab.method1();
    }
    
}
