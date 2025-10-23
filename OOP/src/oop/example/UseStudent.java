package oop.example;

public class UseStudent {
    public static void main(String[] args) {
    Student s1;
    Student s2;
    s1 = new Student();
    s2 = new Student();
    s1.roll = 61;
    s1.name = "waleed";
    s1.gpa = 3.1;

    s2.roll = 82;
    s2.name = "umama";
    s2.gpa = 2.5;
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.gpa);
        System.out.println("the data of second student is given below");
        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.gpa);
    }
}
