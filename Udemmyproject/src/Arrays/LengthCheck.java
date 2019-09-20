package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LengthCheck {
    public static void main(String[] args) {
        String[] myArray = {"april", "march", "may", "july"};
        //int count = 0;

         String word="";
        for (int i = 0; i < myArray.length; i++) {
            word=myArray[i];


            if (myArray[i].length()>word.length()) {
                System.out.println((word));
                //count++;


        }


    }
     //System.out.println(count);
     //Arrays.sort(myArray);
     //System.out.println(Arrays.toString(myArray));



        }
}


