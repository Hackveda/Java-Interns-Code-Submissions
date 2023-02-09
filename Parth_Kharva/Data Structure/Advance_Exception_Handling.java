/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finally_block_exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Parthkharva
 */
public class Finally_block_exception_handling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        System.out.println("-: Welcome to my Addition Calculator Tool :-");
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter First Numeric Value :");
        int no1 = sc.nextInt();

        System.out.println("Please Enter Second Numeric Value :");
        int no2 = sc.nextInt();

        int op = addition(no1, no2);
        System.out.println("The Output is : "+op+".");
        }
        catch(InputMismatchException e){
            System.out.println("Please Enter Intiger Only.");
        }
        finally{
            System.out.println("Intiger Not Found.");
        }
    }
    
    public static int addition(int a, int b){
        int add = 0;
        try{
            add = a+b;
        }
        catch(Exception e){
            System.out.println("Please Enter Intiger Only.");
        }
        finally{
            System.out.println("This is a finally block.");
        }
        return add;
    }

}
