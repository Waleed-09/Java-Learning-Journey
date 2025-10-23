//import java.util.Scanner;
//public class Methods {
//    public static void main(String[] args){
//
//        // method = a block of reusable code that is exwcuted when called ()
//
//      Intro();//  (step 2) yaha per hum jitna call karenge itna wo ayega
//        Intro();
//        Intro();
//    }
//    static void Intro(){           // 1st step yaha per hai hum method ka use karenge
//        System.out.println("Hi, I Am WALEED");
//    }
//}





// hum aik method mai ksi or method ke variables ko declare nhi karskte
//agar aisa karna howa to phir hum kuch u karenge

import javax.xml.namespace.QName;
//import java.util.Scanner;
//public class Methods {
//    public static void main(String[] args){
//
//        // method = a block of reusable code that is exwcuted when called ()
//
//        String name= "waleed";
//        int age = 21;
//
//        Intro(name,age);//  (step 2) yaha per hum jitna call karenge itna wo ayega
//        Intro(name ,age);
//        Intro(name, age);
//    }
//
//    static void Intro(String name,  int age){           // 1st step yaha per hai hum method ka use karenge
//        System.out.printf("My name is %s \n",name);
//        System.out.printf("My age is %d \n", age);
//    }
//}




//import java.util.Scanner;
//public class Methods {
//    public static void main(String[] args){
//
//        // method = a block of reusable code that is exwcuted when called ()
//
//        System.out.println(square(2));
//    }
//
//    static double square(double number){           // 1st step yaha per hai hum method ka use karenge
//      return number * number;
//    }
//}


//import java.util.Scanner;
//public class Methods {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//
//
//        String name = "waleed";
//        int age = 21;
//
//                MyName(name,age);
//    }
//
//    static void MyName(String name,int age){
//        System.out.println("your name is " + name);
//        System.out.println("your age is " + age);
//    }
//
//}



//                                                                                                                                                         overloaded methods
// overloaded method = methods that share the same name but different parameters
// signature = name + parameters

public class Methods {
    public static void main(String[] args){
        System.out.println(add(1,3, 3));
    }
    static double  add(double a, double b){ //                             agar hum dekhe to method name add hi hai lekn andhar paramters different hai

        return a+b;

    }
    static double  add(double a, double b, double c){

        return a+b+c;

    }
}