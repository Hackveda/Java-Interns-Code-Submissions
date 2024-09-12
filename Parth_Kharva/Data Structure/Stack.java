/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package My_Stack;

import java.util.Stack;

/**
 *
 * @author Parthkharva
 */
public class My_Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack instack = new Stack<Integer>();
        System.out.println("Is Stack Empty : "+instack.empty());
        instack.push(40);
        instack.push(2);
        System.out.println("Get the top element : "+instack.peek());
        System.out.println("Is Stack Contains 2 : "+instack.search(2));
        instack.pop();
        System.out.println("Top element after pop operation : "+instack.peek());
    }
    
}
