/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package method_over_loading;

/**
 *
 * @author Parthkharva
 */
class math{
    void sum(int i,int j){
        int add = i+j;
        System.out.println("Sum of two value is :"+add);
    }
    void sum(int i,int j,int k){
    int add = i+j+k;
        System.out.println("Sum of three value is :"+add);
    }
    void sum(int i,int j,int k,int l){
    int add = i+j+k+l;
        System.out.println("Sum of four value is :"+add);
    }
}
public class Method_over_loading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        math obj =new math();
        obj.sum(45, 78);
        obj.sum(45, 91, 12);
        obj.sum(82, 1, 0, 99);
    }
}
