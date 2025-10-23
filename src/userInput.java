//CHAPTER # 02
// USER INPUT
import java.util.Scanner;
public class userInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //      Scanner scanner = new Scanner(System.in);
//input string
//        System.out.print("Enter your Name : ");
//        String name = scanner.nextLine();
//
//input int
//        System.out.print("Enter Your Age : ");
//        int age = scanner.nextInt();
//
//input double
//        System.out.print("Enter your Gpa : ");
//        Double gpa = scanner.nextDouble();
//
//input bollean
//        System.out.println("are you a studemt (true/false)");
//        boolean isStudent = scanner.nextBoolean();


//display all of above in sequence
//        System.out.println("Hello " + name);
//        System.out.println("you are " + age + " years old ");
//        System.out.println("your gpa is " + gpa);
//        if(isStudent){
//            System.out.println("you are a student");
//        }
//        else{
//            System.out.println("you are not a student");
//        }
//
//        scanner.close();
//        System.out.println("enter your age  : ");
//        int old = scanner.nextInt();
//
//        System.out.println("enter your name : ");
//        String naam = scanner.nextLine();
//
//        System.out.println("age is " + old);
//        System.out.println("name is " + naam);

        // to solve this problem just write scanner.nextLine(); below the accepting int input from user



        //project(calculate the area of a rectangle)

        double hieght = 0;
        double width = 0;
        double area = 0;

        System.out.println("enter the hieght of a rectangle : ");
        hieght = scanner.nextDouble();

        System.out.println("enter the width of a rectangle : ");
        width = scanner.nextDouble();

        area = width * hieght;
        System.out.println("The area of a rectangle is " + area );

        scanner.close();
    }
}


