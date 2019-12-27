package OCAudemy;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringArray {
    public static void main(String[] args) {


        String mesaj = "    Bugun hava cok guzel    ";
        System.out.println(mesaj);

       /* System.out.println("Eleman Sayisi:" + mesaj.length());
        System.out.println("5.elaman:" + mesaj.charAt(4));
        System.out.println(mesaj.concat("yasasin"));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));
        System.out.println("===================================");
        char[] characters=new char[5];
        mesaj.getChars(0,5,characters,0);
        System.out.println(characters);
        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.lastIndexOf("e"));*/

       String newMessage=mesaj.replace(' ','_');
        System.out.println(newMessage);

        System.out.println(mesaj.substring(2,5));

        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);

        }
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}