public class VariableScope {

    int x = 5;         //Class --> variable inside a main class is a class scope

    public static void main(String[] args){

        // Variable scope = where a variable can be accessed
        // 1 --> local scope 2-->class scope

        // local scope = variable declared inside a method

        int x = 1;                       // Local
        System.out.println(x);
        dosomething();
    }
static void dosomething(){
        int x = 2;                  // Local --> coz it is inside a dosomething method
    System.out.println(x);
}
}
// ab 1 and 2 print hoga because hamre pass local variable pehle check kiye jate hai

