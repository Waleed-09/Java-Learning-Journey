// Default constructor
class Constructor_Student {
int roll;
String name;
double gpa;

Constructor_Student(){
    roll = 0;
    name = null;
    gpa = 0.0;
}
void show(){
    System.out.println("roll no " + roll);
    System.out.println("name " + name);
    System.out.println("gpa " + gpa);
}
}
public class Main{
    public static void main(String[] args) {
        Constructor_Student student1 = new Constructor_Student();
        student1.show();
    }
}
