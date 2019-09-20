package MyStudy;
import java.util.Scanner;
public class quessingnumberpractice {
    public static void main(String[] args) {
        Scanner gm=new Scanner(System.in);

        int numberUser = 1000;
        int numberToGuess=0;
        int guess=gm.nextInt();
        System.out.println("GUESS A NUMBEER BTW     1 AND 1000");
         numberUser++;

         if(guess==numberToGuess){

         }
         else if(guess<numberToGuess){
             System.out.println("too low");
         }
         else if(guess>numberToGuess){
             System.out.println("too high");
         }

    }
}
