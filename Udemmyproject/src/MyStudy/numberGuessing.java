package MyStudy;
import java.util.Scanner;
public class numberGuessing {
    public static void main(String[] args) {
        int numberToGuess = 101;
        Scanner numberInput = new Scanner(System.in);
        System.out.print(("Guess:"));

        int start =0;

       while(start<5){

        //for(int i=1; i<4;i++){
            int userNumber = numberInput.nextInt();


        if (userNumber==numberToGuess) {

            System.out.println("Congrats");


        } else if (userNumber>numberToGuess) {
            System.out.println("Larger.Try Again");

        } else {
            System.out.println("smaller.Try again" );


        }
        start++;
    }
}}