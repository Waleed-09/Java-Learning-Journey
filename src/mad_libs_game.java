import java.util.Scanner;
public class mad_libs_game {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String noun1;
        String adjective;
        String verb;
        String adjective2;
        String noun2;
        String verb2;

        System.out.println("Enter noun 1 (Enter a person who build facebook) : ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective ");
        adjective = scanner.nextLine();
        System.out.println("Enter a verb  : ");
        verb = scanner.nextLine();
        System.out.println("Enter an adjective 2 : ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter noun 2 (Enter a person who build facebook) : ");
        noun2 = scanner.nextLine();

        System.out.println("the owner of facebook is " + noun1);
        System.out.println("He is a " + adjective + "man");
        System.out.println("this " + adjective + "man " + verb + "hard in his student life");
        System.out.println("he build a facebook with a friend named" + noun2);
        System.out.println("he and his friiend  " + noun1 + "worked" + adjective2);

        scanner.close();
    }
}
