import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("enter your age : ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.println("you age can not be negetive");  // yaha pe aisa hoga ke agr age 0 se less howa to continuesly yai chlega
            System.out.println("enter your age : "); // yaha per age hum dobara lerhe hai take contineully jo loop chl rha hai osko roka jaske
            age = scanner.nextInt(); // pehle jo number store kiya tha hum ne wo 0 se less tha to ab hum naye number ko store krrhe hai
        }
        System.out.println("you are " + age + "years old");

        scanner.close();
    }
}
