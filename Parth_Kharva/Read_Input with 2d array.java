/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package read_input_with_2d_array;

import java.util.Scanner;

/**
 *
 * @author Parthkharva
 */
public class Read_input_with_2D_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your required 2D array Row no:");
        int row = sc.nextInt();
        System.out.println("Enter the your required 2D array column no:");
        int column = sc.nextInt();

        int[][] array = new int[row][column];

        System.out.println("Enter integer elements of the array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your stored array elements are ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j]+"  ");
            }
            System.out.println("\n");
        }
    }

}
