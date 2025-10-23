package Association;
public class Teacher {
    String name;
    Teacher(String name) {
        this.name = name;
    }
}
class Student{
    String name;
    Teacher teacher;

    Student(String name, Teacher teacher){
        this.name= name;
        this.teacher = teacher;
    }
    void show(){
        System.out.println("the student is " + name + "Teacher : " + teacher.name);
    }
}
