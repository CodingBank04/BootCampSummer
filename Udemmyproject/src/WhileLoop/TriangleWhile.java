package WhileLoop;
import java.util.Scanner;
public class TriangleWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many lines:");

        int rows = scanner.nextInt();
        int count = 0;

        while (count <rows) {

            int countInner = 0;

            while (countInner<count) {
                System.out.print("* ");
                countInner++;
            }

            System.out.println();
            count++;
        }

    }
}
