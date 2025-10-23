package association2;
class Address {
    String Village;
    String city;
    String Province;

    Address(String Village, String city, String Province){
        this.Village = Village;
        this.city = city;
        this.Province = Province;


    }
    public String toString() {
        return Village + ", " + city + ", " + Province;
    }

}
class Person{
    String name;
    String FatherName;
    Address Naddress;

    Person(String name, String FatherName, Address Naddress){
        this.name = name;
        this.FatherName = FatherName;
        this.Naddress = Naddress;
    }
    void show(){
        System.out.println(" Name :  " + name + "  Father Name :   " +  FatherName  + " Address " + Naddress);
    }
        }