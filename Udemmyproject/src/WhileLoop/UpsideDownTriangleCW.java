package WhileLoop;
import java.util.Scanner;
public class UpsideDownTriangleCW {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print ("\nHow many rows you want in this pattern? : ");

        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) {

            for (int j = rows; j > i; j--) {
                System.out.print("s");

            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
