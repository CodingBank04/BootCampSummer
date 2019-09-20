package MyStudy;
import java.util.Scanner;

public class dikucgeninhipotenusubulma {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a;
        int b;
        System.out.print("Birinci Kenar:");
        a = scanner.nextInt();
        System.out.print("Ikinci Kenar:");
        b =scanner.nextInt();

        double h = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenus:" + h);
    }
}
