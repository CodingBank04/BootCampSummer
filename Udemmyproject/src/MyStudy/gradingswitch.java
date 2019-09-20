package MyStudy;
import java.util.Scanner;
public class gradingswitch {


        public static void main(String[] args) {
            Scanner score = new Scanner(System.in);
            System.out.println("Please enter your grade 0-100 ");
            int num= score.nextInt();
            num/=10;

            switch(num){
                case 10 :
                    System.out.println("A+");
                    break;
                case 9:
                    System.out.println("A+");
                    break;
                case 8:
                    System.out.println("A");
                    break;
                case 7:
                    System.out.println(" B ");
                    break;
                case 6:
                    System.out.println("C");
                    break;
                case 5 :
                    System.out.println("D");
                    break;
                default :
                    System.out.println("Fail");
}}}
