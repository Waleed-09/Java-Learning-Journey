package encapsulation;

public class UseCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setname("Premio");
        c1.setPrice(2100000);

        System.out.println("the name of a car is " + c1.getname());
        System.out.println("the price of a car is " + c1.getprice());
    }
}
