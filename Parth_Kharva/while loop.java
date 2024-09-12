/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while_loop;

/**
 *
 * @author Parthkharva
 */
public class While_loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=1, j=1;
        while(i<=10){
            while(j<=9){
                System.out.println(j);
                j++;
            }
            i++;
            j=1;
            System.out.print("\n");
        }
    }
    
}
