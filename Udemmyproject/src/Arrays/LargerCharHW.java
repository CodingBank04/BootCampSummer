package Arrays;

import java.util.Arrays;

public class LargerCharHW {
    public static void main(String[] args) {

        String []myArray={"Alabama","Utah" , "Oregon", "Texas", "Virginia"};
        String longChar="";


        for(int i=0; i<myArray.length; i++){


            if (myArray[i].length()>longChar.length()){
             longChar=myArray[i];



            }

        }
        System.out.print(longChar + " is the largest word in the array. ");


    }
}
