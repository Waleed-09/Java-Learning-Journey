// object and class part 2
package p1;

public class UseCar {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();
        Car car2 = new Car();

        car1.brand = "Toyota";
        car1.model = 2005;
        car1.price = 1700000;

        car2.brand = "Honda";
        car2.model = 2015;
        car2.price = 3500000;

        System.out.println("the detail of first car is given below ");
        System.out.println("-------------------------------------------------");
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.price);

        System.out.println("the detail of second car is given below ");
        System.out.println("-------------------------------------------------");
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.price);
    }
}
