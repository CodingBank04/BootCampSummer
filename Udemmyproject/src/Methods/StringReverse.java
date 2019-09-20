package Methods;

public class StringReverse
{
    //that method is solution for the palindrome problem.
    //this is a method for all problem
    public static String isPalindrome(String word){
        String answer ="";
        String reversedWord="";
        for (int i=word.length()-1; i>=0; i--){
            reversedWord= reversedWord + word.charAt(i);

        }
        if(reversedWord.equalsIgnoreCase(word)){
            answer="yes palindrome";

        }
        else{
            answer="not a palindrome";
        }
        return answer;
        ///end of isPalindrome method
     }

    }
