package WhileLoop;
import java.util.Scanner;
public class whileExample {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String answer="";
        while(!(answer.equalsIgnoreCase("Y"))){

            System.out.print("You will be a perfect tester (Y/N)");
            answer=scanner.next();


        }
    }
}
