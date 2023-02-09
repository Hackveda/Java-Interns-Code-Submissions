/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2d_array;

/**
 *
 * @author Parthkharva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] a = new int[3][3];//int[ROW][COLUMN](Basically this is a 3x3 matrics.)
        int i;
        
        System.out.println("Before inserted value :");
        for(i=0; i<a.length;i++){
            for(int j=0; j<a.length;j++){
                System.out.print(a[i][j]);
            }  
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.println("After inserted value :");
        
        // set value at index [3][2] Means 3rd row and 2 column
        a[2][2] = 45;
        
        for(i=0; i<a.length;i++){
            for(int j=0; j<a.length;j++){
                System.out.print(a[i][j]);
            }  
            System.out.print("\n");
        }
        System.out.print("\n");
        
        //define String array creation
        String[][] data = {{"First Name","Last Name"},{"Parth","Kharva"},{"Ashish","Patel"}};
       System.out.println("Before change value :");
        // display value
        for(i=0; i<3;i++){
            for(int j=0; j<2;j++){
                System.out.print(data[i][j]+" ");
            }  
            System.out.print("\n");
        }
        System.out.print("\n");
        
        //change value
        data[2][1] = "Kharva";
        
        System.out.println("after change a value :");
        // display value
        for(i=0; i<3;i++){
            for(int j=0; j<2;j++){
                System.out.print(data[i][j]+" ");
            }  
            System.out.print("\n");
        }
        
    }
}
