package MyStudy;
import java.util.Scanner;
public class ifelsebloklari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // else yada , hicbir durumda

        System.out.print("Lutfen bir sayi girin:");
        int sayi = scanner.nextInt();

        if (sayi < 0) {
            System.out.println("negatif");

        }
        else {
            System.out.println("Positif veya 0");
        }
    }
}