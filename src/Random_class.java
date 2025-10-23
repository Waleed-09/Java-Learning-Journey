import java.util.Random;         // yai wese hi hai jaise hum scanner object bnate the
public class Random_class {
    public static void main(String[] args) {

        Random random = new Random();

        //for int
        int number;
        number = random.nextInt(1,9);

        System.out.println("the random number from 0 to 9 is : " + number);

        //  boolean
        boolean isHead;
        isHead = random.nextBoolean();
        if (isHead){
            System.out.println("Head");
        }
        else{
            System.out.println("TAIL");
        }
    }
}
