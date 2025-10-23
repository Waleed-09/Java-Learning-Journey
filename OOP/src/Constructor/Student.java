// parametarized constructor part 1
package Constructor;
public class Student {
    String name;
    int roll;
    int grade;
    double gpa;

    Student(String n, int r, int g, double gp){
        name = n;
        roll = r;
        grade = g;
        gpa = gp;
    }
    void show(){
        System.out.println("the name of student is : " + name);
        System.out.println("the roll no of student is : " + roll);
        System.out.println("the class of student is : " + grade);
        System.out.println("the gpa of student is : " + gpa);
    }
}
