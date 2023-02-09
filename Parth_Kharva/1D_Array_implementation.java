/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1d_array;

/**
 *
 * @author Parthkharva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //types of array declaration
        int a[];
        int[] b = new int[10];
        //assign a value in a two ways
        int[] numbers = {178, 299, 375, 412, 5, 16, 78, 80, 91};//at compile time
        //or
        int[] no = new int[3];
        no[0]=10;
        no[1]=20;
        no[2]=30;
        
        // print array Values:
         System.out.println("Array values of no : ");
        for(int x=0; x<no.length;x++){
            System.out.println(no[x]);
        }
        

        int check_no1 = 91;
        int check_no2 = 9;
        boolean match = false;
        int i;
        System.out.print("Your selected array Values : ");
        for(i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+",");
        }
        
        //find numbers according to our requirement
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] == check_no1) {
                match = true;
                break;
            }
        }
        if (match == true){
            System.out.println("\nyour requested Number : "+ check_no1+" is matched at index Position : "+i+"." );
            match = false;
        }
        else{
            System.out.println("your requested Number : "+ check_no1+" is not matched in the array." );
        }
        
       
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] == check_no2) {
                match = true;
                break;
            }
        }
        if (match == true){
            System.out.println("your requested Number : "+ check_no2+" is matched at index Position : "+i+"." );
            match = false;
        }
        else{
            System.out.println("your requested Number : "+ check_no2+" is not matched in the array." );
        }
        
        // Find length of the array
        System.out.println("Full length of array is : "+numbers.length);
    }
}
