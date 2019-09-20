package MyStudy;
import java.util.Scanner;
public class BedenKitleEndeksi {
    public static void main(String[] args) {
        //beden kitle endeks:Kilo/Boy(m)*Boy(m)
        Scanner scanner =new Scanner(System.in);



        // print dedigimizde input u sout yaninda girmemizi saglar.
        System.out.print("Kilonuzu Girin:");
        int kilo =scanner.nextInt();
        System.out.print("Boyunuza girrin;(Ornek:1.72)");
        double boy=scanner.nextDouble();

        double bki = kilo/boy*boy;
        System.out.println("Beden Kitle Indekisiniz;" + bki);

    }
}

