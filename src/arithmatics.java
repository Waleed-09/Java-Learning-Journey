import java.util.Scanner;
public class arithmatics {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //augmented assignment operator

//        int x = 10;
//        int y = 2;
        // x = x + y;  instead of this use augmented assignment operator
//        x += y;
//        System.out.println(x);


        // ORDER OF OPERATIONS (P-E-M-D-A-S)
        // PERENTHESIS,,EXPONENTS,MULTIPLICATIONS,,DEVISION,,ADDITION,,SUBTRACTION


        double result = 4 + 2 * ( 3 - 1 ) / 2.0 ;
        System.out.println(result);



        scanner.close();

    }
}
