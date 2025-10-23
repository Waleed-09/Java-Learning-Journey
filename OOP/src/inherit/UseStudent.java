package inherit;

public class UseStudent {
    public static void main(String[] args) {
    StudentOfComsats s1 = new StudentOfComsats();
    s1.name = "Waleed";
    s1.age = 21;

    s1.parent();
    s1.child();
}
}
