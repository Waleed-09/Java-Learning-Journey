public class mathClass {
    public static void main(String[] args){
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double power;
        power = Math.pow(2,3);
        System.out.println(power);

        double SquareRoot;
        SquareRoot = Math.sqrt(16);
        System.out.println(SquareRoot);

        double absolute;
        absolute = Math.abs(-5);
        System.out.println(absolute);

        /* instead of this we can use
        Math.max for highest value among 2
        Max.min for lower value
        Max.ceil and Max.floor
        and Max.round for rounding the value
         */

    }
}
//import java.util.Scanner;
//public class FindingHypotheneus {
//    public static void main(String[] args){
//        // hypotheneus c = Math.sqrt(c = √(a2 + b2).
//        Scanner scanner = new Scanner(System.in);
//        double a;
//        double b;
//        double c;
//
//        System.out.println("Enter the length of A ;  ");
//        a = scanner.nextDouble();
//
//        System.out.println("Enter the length of A ;  ");
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//        System.out.println("the hypotheneus is : " + c);
//
//        scanner.close();
//
//    }
//
//
//}