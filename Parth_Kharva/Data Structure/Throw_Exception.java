/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package throw_exception;

import java.util.Scanner;

/**
 *
 * @author Parthkharva
 */
public class Throw_exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-: Welcome to my Heart Rate Calculator Tool :-");
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Your Right Age Sir/Ma'am :");
        int age = sc.nextInt();

        if (age <= 0) {
            throw new NumberFormatException();
        } else if (age >= 120) {
            throw new NumberFormatException();
        }
        int MaxRate = 220 - age;
        System.out.println("Your Maximum Heart Rate Should be: " + MaxRate + ".");
        System.out.println("-: Thank You For Using My Tool :-");
    }

}
