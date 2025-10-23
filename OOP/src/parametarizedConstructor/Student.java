// parametarized constructor part 1
package PConstuctor;
    class Student {
        String name;
        int roll;
        double gpa;

        Student(String n, int r, double g){
            name = n;
            roll = r;
            gpa = g;
        }

        void show(){
            System.out.println("name " + name);
            System.out.println("name " + roll);
            System.out.println("name " + gpa);
        }
}
