package staticc;

public class Staticc {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        Student.uni = "Fast";
        System.out.println("the uni of student 1 is " + s1.uni);
        System.out.println("the uni of student 2 is " + s2.uni);
    }
}
