public class ternaryOperator {
    public static void main(String[] args){

        // variable =  (condition) ?  ifTrue : ifFalse
        int hours = 13;
        String TimeOfDay = ( hours < 12 ) ? "A.M" : "P.M";
        System.out.println(TimeOfDay);
    }
}
