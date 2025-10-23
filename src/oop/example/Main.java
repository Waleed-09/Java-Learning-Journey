package oop.example;

public class Main {
    public static void main(String[] args) {

        // Object creation
        oop student1 = new oop();
        oop student2 = new oop();

        // Assigning values to attributes
        student1.roll = 101;
        student1.name = "Waleed Ali";
        student1.gpa = 3.85;



        // Displaying the data
        System.out.println("Student 1 Info:");
        System.out.println("Roll No: " + student1.roll);
        System.out.println("Name: " + student1.name);
        System.out.println("GPA: " + student1.gpa);
    }
}
