/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack_using_arraydeque;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 *
 * @author Parthkharva
 */
public class Stack_using_arraydeque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayDeque mydeque = new ArrayDeque<String>();
        mydeque.add("Ashish");
        mydeque.addFirst("Parth");
        mydeque.addLast("Parit");
        mydeque.offerFirst("Riya");
        mydeque.offer("Piya");
        
        System.out.println("First Element : "+mydeque.getFirst());
        System.out.println("Last Element : "+mydeque.getLast());
        System.out.println("Deque Contains 'Parth' : "+mydeque.contains("Parth"));
        System.out.println("Iterating All The Elements In Decending Order : ");
        Iterator<String> myiterator = mydeque.descendingIterator();
        
        while(myiterator.hasNext()){
            System.out.println(myiterator.next());
        }
        
    }
    
}
