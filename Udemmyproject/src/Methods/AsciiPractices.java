package Methods;

public class AsciiPractices {
    public static void listASCII(){
         for (int i=0; i<256; i++){
             System.out.printf("%2s",(char)i);
             if(i%32==0){
                 System.out.println();
             }

         }
    }
}
