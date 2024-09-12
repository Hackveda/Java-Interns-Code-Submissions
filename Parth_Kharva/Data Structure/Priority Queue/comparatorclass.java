/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package priority_queue;

import java.util.Comparator;

/**
 *
 * @author Parthkharva
 */
public class new_Comparator_Of_PQ implements Comparator<Integer> {
    public int compare(Integer p1, Integer p2){
        if(p1>=p2){
            return p1;
        }
        else{
            return p2;
        }
    }
}
