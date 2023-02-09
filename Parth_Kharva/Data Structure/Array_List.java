/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author Parthkharva
 */
public class array_list {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("My Array list :");
        ArrayList myarraylist = new ArrayList();
        myarraylist.add(1);//starting index 0
        myarraylist.add(2);
        myarraylist.add(3);
        
        System.out.println(myarraylist.get(0));
        System.out.println(myarraylist.get(1));
        System.out.println(myarraylist.get(2));
        
        myarraylist.add(2,89);//change at index 2
        System.out.println("My UPdated element is : "+ myarraylist.get(2)+"\n");
        System.out.println("My Updated Array list :");

        ArrayList myarraylist2 = new ArrayList();
        myarraylist2.addAll(myarraylist);
        System.out.println(myarraylist2.get(0));
        System.out.println(myarraylist2.get(1));
        System.out.println(myarraylist2.get(2));
        System.out.println(myarraylist2.get(3)+"\n");
        
        myarraylist2.clear();
        try{
        System.out.println(myarraylist2.get(0));
        System.out.println(myarraylist2.get(1));
        System.out.println(myarraylist2.get(2));
        System.out.println(myarraylist2.get(3));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("My array List is clear. \n");
        }
        
        ArrayList clonelist = (ArrayList) myarraylist.clone();
        System.out.println("My Clone List :");
        System.out.println(myarraylist.get(0));
        System.out.println(myarraylist.get(1));
        System.out.println(myarraylist.get(2));
        System.out.println(myarraylist.get(3));
    }
}
