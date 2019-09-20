package SelfStudy;

public class AsciiPractices
{
    public static void listASCII (){
        for( int i=0 ; i<256; i++){
            System.out.printf("%2s",(char) i);
             if (i%16==0){
                 System.out.printf("\t\t\n");
             }
        }
    }

}
