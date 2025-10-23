package immutableClass;

import java.util.Date;
final class Student {
    private final String name;
    private final int roll;
    private final Date dob;

    public Student(String name, int roll, Date dob){
        this.name = name;
        this.roll = roll;
        this.dob = new Date(dob.getTime());
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public Date getDob() {
        return new Date(dob.getTime());
    }
}
