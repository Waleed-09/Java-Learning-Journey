public class BreakContinue {
    public static void main(String[] args){

        // break = break out of a loop (stop)
        // continue = skip the current iteration of a loop (skip)

        //                                     break
        for(int i = 0; i <= 10; i++){
            if(i == 5){
                break;
            }
            System.out.print(i + " ");
        }

        //                                        continue
        for(int j = 0; j <= 10; j++){
            if(j == 5){
                continue;
            }
            System.out.println(j + " ");
        }
    }
}


