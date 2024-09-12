/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lambda;

/**
 *
 * @author Parthkharva
 */
public interface practice_1 {
    void abstractfunction(int a);
    default void normalfunction(){
        System.out.println("Hello ji");
    }
}
