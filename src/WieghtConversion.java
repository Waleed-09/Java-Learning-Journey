import java.util.Scanner;
public class WieghtConversion {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double wieght;
        double netWieght;
        int choice;

        System.out.println("Wieght conversion program");
        System.out.println("1: convers lbs to kgs");
        System.out.println("2: convers kgs to lbs");

        System.out.println("Enter your choice : ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Enter your wieght in lbs");
            wieght = scanner.nextDouble();

            netWieght = wieght * 0.453592;
            System.out.println("your wight in kgs is : " + netWieght);
        }
        else if(choice == 2){
            System.out.println("enter your wieght in kgs : ");
            wieght = scanner.nextDouble();
            netWieght = wieght * 2.20462;
            System.out.println("your wight in lbs is " + netWieght);
        }
        else{
            System.out.println("invalid choice");
        }

        scanner.close();

    }

}
