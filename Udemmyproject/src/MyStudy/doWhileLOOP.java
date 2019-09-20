package MyStudy;
import java.util.Scanner;
public class doWhileLOOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter any number:");

        int num = scanner.nextInt();
        int total = 0;

        do {
            total += num % 10;

            num /= 10;
            System.out.println("number: " + num);
        }while(num > 0);

        System.out.println("Total of each number = " + total);

    }
}
