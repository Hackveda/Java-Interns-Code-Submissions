/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package priority_queue;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author Parthkharva
 */
public class Priority_queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        System.out.println("Is PQ Empty : "+pq.isEmpty());
        
        new_Comparator_Of_PQ new_compar = new new_Comparator_Of_PQ();
        PriorityQueue pq1 = new PriorityQueue(new_compar);
        
        pq.add(34);
        pq1.add(34);
        
        pq.add(26);
        pq1.add(26);
        
        pq.add(1);
        pq1.add(1);
        
        pq.add(100);
        pq1.add(100);
        
        Iterator pq_it = pq.iterator();
        Iterator pq1_it = pq1.iterator();
        System.out.println("PQ Priority Queue :");
        while(pq_it.hasNext()){
            System.out.println(pq_it.next());
        }
        System.out.println("PQ1 Priority Queue :");
        while(pq1_it.hasNext()){
            System.out.println(pq1_it.next());
        }

    }
    
}
