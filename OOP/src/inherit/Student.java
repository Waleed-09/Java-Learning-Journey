package inherit;
class Student {
    String name;
    int age;

    void parent(){
        System.out.println("the teacher is " + age + "years old" );
    }
}
class StudentOfComsats extends Student{
    String name;
    int age;

    void child(){
        System.out.println("the name of student is " + name);

    }
}


