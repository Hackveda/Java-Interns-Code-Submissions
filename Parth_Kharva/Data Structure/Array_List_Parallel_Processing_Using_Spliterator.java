/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist_parallel_processing_using_spliterator;

import java.util.ArrayList;
import java.util.Spliterator;

/**
 *
 * @author Parthkharva
 */
public class Arraylist_parallel_processing_using_spliterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> insta_post = new ArrayList<String>();
        
        insta_post.add("post1");
        insta_post.add("post2");
        insta_post.add("post3");
        insta_post.add("post4");
        insta_post.add("post5");
        insta_post.add("post6");
        
        Spliterator<String> spl1 = insta_post.spliterator();
        Spliterator<String> spl2 = spl1.trySplit();
        System.out.println("SPL1 Estimated size of data : "+spl1.estimateSize());
        System.out.println("SPL1 Exact size : "+spl1.getExactSizeIfKnown());
        
        spl1.forEachRemaining(System.out::println);
        
        System.out.println("SPL1 Estimated size of data : "+spl1.estimateSize());
        System.out.println("SPL1 Exact size : "+spl1.getExactSizeIfKnown());
        
        System.out.println("SPL2 Estimated size of data : "+spl2.estimateSize());
        System.out.println("SPL2 Exact size : "+spl2.getExactSizeIfKnown());
        
        spl2.forEachRemaining(System.out::println);
        
        System.out.println("SPL1 Estimated size of data : "+spl1.estimateSize());
        System.out.println("SPL1 Exact size : "+spl1.getExactSizeIfKnown());
        
        
    }
    
}
