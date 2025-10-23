import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // shopping cart program
        String items;
        double price;
        int quantity;
        char currency = '$' ;
        double total;

        System.out.println("What you want to buy : ");
        items = scanner.nextLine();

        System.out.println("What is the price for each : ");
        price = scanner.nextDouble();

        System.out.println("what is the quantity: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("You bought the " + quantity + items + " CONGRATULATIONS!");
        System.out.println("your total bill is " + currency + total);


        scanner.close();

    }
}
