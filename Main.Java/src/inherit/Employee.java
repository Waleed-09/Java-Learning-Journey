package inherit;
class Employee {
    int salery = 80000;
}
class programmer extends Employee{
    int bonus = 10000;

    public static void main(String[] args) {
        programmer p = new programmer();
        Employee e = new Employee();
        System.out.println("the Employee salery is : " + e.salery);
        System.out.println(p.bonus);
        System.out.println(p.salery);
    }
}
