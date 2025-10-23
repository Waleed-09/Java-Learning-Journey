public class Printf {
    // printf() = printf is a statement used to format output
    //%d, %c,  %f

    public static void main(String[] args){

        int a = 105;
        System.out.printf("%d \n", a);

        String name = "WALEED";
        System.out.printf("Hello %s \n", name);

        // for boolean = % b ,, for charector = %c ,, for double = %c


        // precision

        double num1 =  1.11;
        double num2 =  1.11111;
        double num3 = -0.3333;

        System.out.printf("%f \n", num1);
        System.out.printf("% .1f \n",num1);
        System.out.printf("% .2f \n",num1);

        // padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d \n", id1);
        System.out.printf("%-4d \n", id2);
        System.out.printf("%-4d \n", id3);
        System.out.printf("%-4d \n", id4);

        System.out.printf("%4d \n", id1);
        System.out.printf("%4d \n", id2);
        System.out.printf("%4d \n", id3);
        System.out.printf("%4d \n", id4);


    }
}
