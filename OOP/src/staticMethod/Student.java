// this is non static method
package staticMethod;
class Student {
    void showInfo(){
        System.out.println("This is Non static method ");
    }
}
class staticMethod{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.showInfo();
    }
}
