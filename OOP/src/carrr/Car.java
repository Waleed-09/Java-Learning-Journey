package carrr;
public class Car {
    String name;
    int model;
    double price;
    String company;

    Car(String n,int m, double p, String c){
        name = n;
        model = m;
        price = p;
        company = c;
    }
    void show(){
        System.out.println("-------------------------------------");
        System.out.println("the name of car is " + name);
        System.out.println("mode : " + model);
        System.out.println("price : " + price);
        System.out.println("company : " + company);
        System.out.println("-------------------------------------");
    }
}
