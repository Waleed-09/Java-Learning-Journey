package example.java;

public class UseExample {
    public static void main(String[] args) {
        Student s1;
        s1 = new Student();
        Student s2;
        s2 = new Student();
        Student s3;
        s3 = new Student();

        s1.roll = 61;
        s1.name = "waleed";
        s1.gpa=3.1;

        s2.roll = 55;
        s2.name = "kashif";
        s2.gpa=3.4;

        s3.roll = 133;
        s3.name = "abdur";
        s3.gpa=3.3;

        System.out.println("the data for first student is given below");
        System.out.println("------------------------------------------------------");
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.gpa);

        System.out.println("the data for second student is given below");
        System.out.println("------------------------------------------------------");
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.gpa);

        System.out.println("the data for third student is given below");
        System.out.println("------------------------------------------------------");
        System.out.println(s3.name);
        System.out.println(s3.roll);
        System.out.println(s3.gpa);





    }
}
