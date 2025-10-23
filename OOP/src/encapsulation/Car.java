package encapsulation;
public class Car {
    private String name;
    private int price;

    public void setname(String n){
        name = n;
    }
    public void setPrice(int p){
        price = p;
    }
    public String getname(){
        return name;
    }
    public int getprice(){
        return price;
    }
}
