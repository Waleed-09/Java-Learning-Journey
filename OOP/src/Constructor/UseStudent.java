// parametarized constructor part 2
package Constructor;

public class UseStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Waleed", 61, 4, 3.1);
        Student s2 = new Student("Umama", 82, 4, 2.4);
        Student s3 = new Student("Kashif", 55, 4, 3.4);
        Student s4 = new Student("Abdur", 12, 4, 3.3);
        Student s5 = new Student("Nasir", 63, 4, 2.1);
        Student s6 = new Student("Shaheed", 74, 4, 3.3);
        Student s7 = new Student("Umair", 169, 4, 3.2);

        s1.show();
        s2.show();
        s3.show();
        s4.show();
        s5.show();
        s6.show();
        s7.show();
    }
}
