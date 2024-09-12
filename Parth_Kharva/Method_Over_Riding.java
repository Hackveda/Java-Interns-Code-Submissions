/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package method_overriding;

/**
 *
 * @author Parthkharva
 */
class employee {

    String name;
    int age;
    double salary;

    void printdata() {
        System.out.println("Name : " + name + "\nAge : " + age + "\nSalary : " + salary);
    }
}

class emp1 extends employee {

    String language;

    @Override
    void printdata() {
        super.printdata();
        System.out.println("Language : "+language);
    }
}

class emp2 extends emp1{
    String database_tool;
    void printdata(){
        super.printdata();
        System.out.println("Database tool : "+ database_tool);
    }
}

public class Method_overriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        employee obj1 = new employee();
        obj1.name = "Ashish";
        obj1.age = 24;
        obj1.salary = 19607.67;
        obj1.printdata();
        
        emp1 obj2 = new emp1();
        obj2.name = "khyati";
        obj2.age = 21;
        obj2.salary = 12987.276;
        obj2.language = "Java";
        obj2.printdata();
        
        emp2 obj3 = new emp2();
        obj3.name = "Parth";
        obj3.age = 20;
        obj3.salary = 14928.78;
        obj3.language = "Java";
        obj3.database_tool = "MySQL";
        obj3.printdata();
    }

}
