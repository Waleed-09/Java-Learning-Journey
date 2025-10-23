package exmaple;
class Student {
    String name;
    int roll;
    double gpa;
    int grade;

    Student(String n,int r, double g, int gr){
        name = n;
        roll = r;
        gpa = g;
        grade = gr;
    }
    void show(){
        System.out.println("------------------------------------------------");

        System.out.println("The name of Student 1 is " + name);
        System.out.println("the roll number of " + name + " is " + roll);
        System.out.println("the gpa number of " + name + " is " + gpa);
        System.out.println("the grade number of " + name + " is " + grade);

        System.out.println("-------------------------------------------------");
    }
}
