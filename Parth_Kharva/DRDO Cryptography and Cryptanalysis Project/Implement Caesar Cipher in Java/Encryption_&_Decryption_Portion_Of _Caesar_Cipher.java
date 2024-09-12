/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caesarciphe;

import java.util.Scanner;

/**
 *
 * @author Parthkharva
 */
public class Caesarciphe {

    /**
     * @param args the command line arguments
     */
    public static String Encrypt(String text, int positions) {
        String toEncrypt = "", result = "";
        //Message encrypted
        for (int i = 0; i < text.length(); i++) {
            //remove spacings 

            if (text.charAt(i) == ' ') {
                continue;
            } else {
                //convert lowercase to uppercase
                if (Character.isLowerCase(text.charAt(i))) {
                    toEncrypt += Character.toUpperCase(text.charAt(i));
                } //if already uppercase keep the uppercase character
                else {
                    toEncrypt += text.charAt(i);
                }
            }
        }
        for (int i = 0; i < toEncrypt.length(); i++) {
            //shift the current letter of the message with given positions from right.
            char shiftedLetter = (char) (toEncrypt.charAt(i) + positions);

            //if the ASCII code exceeds Z, then bring it back in the interval A..Z
            if (shiftedLetter > 'Z') {
                shiftedLetter = (char) (shiftedLetter + 'A' - 'Z' - 1);
            }
            result += shiftedLetter;
        }
        return result;
    }

    public static String Decrypt(String text, int positions) {
        //encrypted code is already uppercase,
        String result = "";
        for (int i = 0; i < text.length(); i++) {

            //shift the current letter of the message with given positions to left
            char shiftedLetter = (char) (text.charAt(i) - positions);

            //if the ASCII code exceeds A, then bring it back in the interval A..Z
            if (shiftedLetter < 'A') {
                shiftedLetter = (char) (shiftedLetter - 'A' + 'Z' + 1);
            }
            result += shiftedLetter;

        }

        return result;
    }

    public static void main(String[] args) {
        //message input code
        System.out.println("CAESAR CIPHER");
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Your Important Message : ");
        String message = sc.nextLine();
        System.out.print("Type the key: ");
        int key = sc.nextInt();
        sc.close();
        System.out.println("\n");

        //  message Encryption code
        System.out.println("Process : Encrypting...");
        String encryptedMessage = Encrypt(message, key);
        System.out.println("The encrypted message is: " + encryptedMessage);
        System.out.println("\n");
        System.out.println("Process : Encryption Complete...");
        
        //  message Dencryption code
        System.out.println("Process : Decrypting...");
        String restoredMessage = Decrypt(encryptedMessage, key);
        System.out.println("The Decrypted message is: " + restoredMessage);
        System.out.println("Process : Decryption Complete...");
    }
}
