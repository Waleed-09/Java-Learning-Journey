// overloaded constructor part 1
package Main;
public class Student {
    String name;
    int roll;
    double gpa;

    Student(){
        name = "unknown";
        roll = 0;
        gpa = 0.0;
    }

    Student(String n, int r){
        name = n;
        roll = r;
        gpa = 0.0;
    }

    Student(String n, int r, double g){
        name = n;
        roll = r;
        gpa = g;
    }

    void show(){
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        System.out.println("the name of student is " + name);
        System.out.println("the roll number of student is " + roll);
        System.out.println("the gpa of " + name + " is " + gpa);
        System.out.println("-----------------------------------------------");
        System.out.println("------------------------------------------------");
    }

}
