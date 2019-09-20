package MyStudy;
import java.util.Scanner;

public class ikisayinindegerinidegistirme {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int birinci_sayi;
        int ikinci_sayi;

        System.out.print("birinci Sayi:");
        birinci_sayi= scanner.nextInt();

        System.out.print("Ikinci Sayi:");
        ikinci_sayi= scanner.nextInt();

        System.out.println("Degistirilmeden once;.....");
        System.out.println("Birinci sayi:"+birinci_sayi + " Ikinci sayi:" + ikinci_sayi);


        int gecici = birinci_sayi;
        birinci_sayi=ikinci_sayi;
        ikinci_sayi=gecici;


        System.out.println("Degistirildikten sonra:");

        System.out.println("Birinci sayi :"+ birinci_sayi + " Ikinci sayi:" + ikinci_sayi);



    }
}

