package association2;

public class UseThis {
    public static void main(String[] args) {
        Address a1 = new Address("Nawagai"," Buner", "Kpk" );
        Person p1 = new Person(" Waleed", " Liaqat Ali " , a1);

        p1.show();

    }
}
