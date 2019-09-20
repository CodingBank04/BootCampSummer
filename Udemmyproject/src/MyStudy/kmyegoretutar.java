package MyStudy;
import java.util.Scanner;

public class kmyegoretutar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Araciniz kilometre kac kurus yakiyor? (Ornek:0.32);");
        double kurus = scanner.nextDouble();

        System.out.print("Aracinizla kac km gittiniz:");
        int km= scanner.nextInt();

        System.out.println("Toplam odemeniz gereken tutar" + (kurus*km) + "TL dir...");
    }
}
