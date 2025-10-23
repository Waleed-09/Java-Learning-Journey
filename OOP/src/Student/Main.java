// encapsluation --> private
package Student;
class Student {
    private String name;
    private double gpa;

    public void setName(String n){
        name = n;
    }
    public void setGpa(double g){
        if(g >=0.0 && g <=4.0){
            gpa = g;
        }
        else{
            System.out.println("invalid gpa (gpa can not be negetive) ");
        }
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }
}

public class Main{
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("WALEED");
        s1.setGpa(3.1);

        System.out.println("name " + s1.getName() + " gpa is " + s1.getGpa());

        Student s2 = new Student();
        s2.setName("Umama");
        s2.setGpa(5.3);
        System.out.println(s2.getGpa());
    }
}

