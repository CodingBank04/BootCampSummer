package Methods;

public class ReverseString {
    public static void reverseString(String reverse){
        for(int i = reverse. length() - 1; i >= 0; i--) {
            System.out.print( reverse.charAt(i));
        }

        }
        public static void writeBackward(String inputString){
        for(int i=inputString.length()-1; i>=0; i--){
            System.out.println( inputString.charAt(i));

        }}
            public static String reverseNumber1(String word){
                 String reversed="";
                for(int i = word.length() - 1; i >= 0; i--) {
                    reversed= reversed + word.charAt(i);
                }
                return reversed;
        }
}
