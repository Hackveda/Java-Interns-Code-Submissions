/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inharitance;

/**
 *
 * @author Parthkharva
 */
class a{
    int x =90;
    public void value1(){
        System.out.println("this is a class A");
    }
}
class b extends a{
    public void value2(){
        System.out.println("this is a class B");
    }
}
public class Inharitance extends b{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        b obj = new b();
        obj.value1();
        obj.value2();
        System.out.println("class a variable x value is :"+obj.x);
    }
    
}
