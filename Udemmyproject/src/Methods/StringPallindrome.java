package Methods;

public class StringPallindrome {
    public static void main(String[] args) {
        int balance = 10000;
        String message = "Your balance is: " + balance;
        System.out.println(message);

        System.out.println(pallinDrome("Dad"));

    }
         public static String pallinDrome(String word){
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        if(word.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("is not Palindrome");
        }
        return reversed;


    }
}
