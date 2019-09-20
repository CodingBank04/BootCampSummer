package MyStudy;

public class MantiksalOperatorler {
    public static void main(String[] args) {
        /*
        Mantiksal operatorler

        && ----> and operatoru
        butun sonuclar kendi icinde true ise genel sonuc true, en an birisi bile false ise genel sonuc false olu.
        II ---> or operatoru
        sonuclardan en az birisi bile true is genel sonuc true . hepsi false ise genel sonuc false olur.

        !------> not operatoru
         */
        System.out.println(2>3);
        System.out.println("Murat"=="Murat");

        System.out.println((3==3 && 2<3 && "Murat"=="Murat"));

        System.out.println((3==3 && 2<3));
        System.out.println((3!=3 || 4<3 || 4>=4));
        System.out.println(!(3<4));



    }
}
