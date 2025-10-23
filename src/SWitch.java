import java.util.Scanner;
public class SWitch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char op;
        double result = 0;

        System.out.println("enter your first number : ");
        num1 = scanner.nextDouble();

        System.out.println("enter your second number : ");
        num2 = scanner.nextDouble();

        System.out.println("enter the operator (+,-,*,/): ");
        op = scanner.next().charAt(0);

        switch (op){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
        }
        System.out.println(result);

        scanner.close();
    }
}
