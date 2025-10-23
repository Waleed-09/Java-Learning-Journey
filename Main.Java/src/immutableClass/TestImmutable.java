package immutableClass;

import java.util.Date;

public class TestImmutable {
    public static void main(String[] args) {
        Date d = new Date();
        Student s1 = new Student("Waleed", 61,d);
        System.out.println(s1.getName());
        System.out.println(s1.getRoll());
        System.out.println(s1.getDob());

        d.setTime(999_999);
        System.out.println(s1.getDob());
    }
}
