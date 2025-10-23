//import java.util.Random;
//import java.util.Scanner;
//public class NumberGuessingGame {
//    public static void main(String[] args){
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//
//        int guess;
//        int attempts = 0;
//        int RandomNumber = random.nextInt(1,  11);
//
//        System.out.println("Number guessing Number");
//        System.out.println("guess a number between 1-10");
//
//        do{
//            System.out.println("enter a guess : ");
//            guess = scanner.nextInt();
//            attempts++;
//        }while(guess != RandomNumber);
//
//        System.out.println("correct! you won " + RandomNumber);
//
//        scanner.close();
//
//    }
//}

//                                                                                                                      OR

import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int RandomNumber = random.nextInt(1,  11);

        System.out.println("Number guessing Number");
        System.out.println("guess a number between 1-10");

        do{
            System.out.println("enter a guess : ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < RandomNumber){
                System.out.println("too low");
            }
            else if(guess > RandomNumber){
                System.out.println("too high");
            }
            else{
                System.out.println("you found the number " + RandomNumber);
            }
        }while(guess != RandomNumber);

        System.out.println("correct! you won " + RandomNumber);

        scanner.close();

    }
}
