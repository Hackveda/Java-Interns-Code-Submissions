/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package to_array_function;

import java.util.ArrayList;

/**
 *
 * @author Parthkharva
 */
public class To_array_function {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> team_member = new ArrayList<String>();
        
        team_member.add("Parth");
        team_member.add("Ashish");
        team_member.add("Parit");
        team_member.add("Atmiya");
        team_member.add("Arpit");
        Object[] array_team_member = team_member.toArray();
        System.out.println("Element At Index '0' For Array: "+array_team_member[0]);
        System.out.println("HasCode Of The Array: "+array_team_member.hashCode());
    }
    
}
