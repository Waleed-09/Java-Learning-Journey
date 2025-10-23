package Association;

public class UseAssociation {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mr Liaqat ");
        Student s1 = new Student("Waleed Khan",t1);
        s1.show();

        Teacher t2 = new Teacher("qurat ul ain");
        Student s2 = new Student("abdur", t2);
        s2.show();
    }
}
