// overloaded constructor part2
package Main;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Waleed",61);
        Student s3 = new Student("Kashif", 55,3.4);
        Student s4 = new Student("Umama",82);
        s1.show();
        s2.show();
        s3.show();
        s4.show();

    }
}
