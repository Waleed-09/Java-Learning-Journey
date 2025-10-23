import java.util.Scanner;
public class if_statement {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int num;
       String name;

       System.out.println("Enter your name: ");
       name = scanner.nextLine();

       System.out.println("ENter your number: ");
       num = scanner.nextInt();
 //group 1
       if(name.isEmpty()){
           System.out.println("you did not enter your name😢 "); //for emoji click win + .
       }
       else{
           System.out.println("your name is " + name);
       }

       //group 2
       if(num >= 18){
           System.out.println("your are adult");
       }
       else{
           System.out.println("you are under 18");
       }


       scanner.close();

   }
}
