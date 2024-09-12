/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package read_input_with_array;

import java.util.Scanner;

/**
 *
 * @author Parthkharva
 */
public class Read_input_with_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your required array size:");
        int size = sc.nextInt();

        //string
        String[] array = new String[size];
        System.out.println("Enter String elements of the array : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.next();
        }
        System.out.println("Your stored array elements are ");
        for (int j = 0; j < size; j++) {
            System.out.println(array[j]);
        }

        //int
        int[] arrays = new int[size];
        System.out.println("Enter integer elements of the array : ");
        for (int i = 0; i < size; i++) {
            arrays[i] = sc.nextInt();
        }
        System.out.println("Your stored array elements are ");
        for (int j = 0; j < size; j++) {
            System.out.println(arrays[j]);
        }
    }

}
