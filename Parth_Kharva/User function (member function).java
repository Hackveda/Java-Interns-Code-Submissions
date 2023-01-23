/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package user_function.memberfunction;

/**
 *
 * @author Parthkharva
 */
public class User_functionMemberfunction {

    /**
     * @param args the command line arguments
     */
    
    String name;
    int roll_no;
    int age;
    String university_name;
    float cgpa;
    
    public void student_info(){
    System.out.println("Name : "+name+" \nRoll No : "+roll_no+" \nAge : "+age+" \nUniversity Name : "+university_name+" \nCGPA OF LAST SEM : "+cgpa);
    }
    public static void main(String[] args) {
        User_functionMemberfunction uf = new User_functionMemberfunction();
        uf.name = "Parth Kharva";
        uf.roll_no = 15;
        uf.age = 20;
        uf.university_name = "Navrachana University";
        uf.cgpa = 8.64f;
        uf.student_info();
    }
}
