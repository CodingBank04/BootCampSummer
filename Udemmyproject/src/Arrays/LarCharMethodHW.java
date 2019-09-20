package Arrays;

import java.util.Arrays;

public class LarCharMethodHW {
          public static String longCharState(String [] myArray){

              String longChar="";

              for (int i=0 ; i<myArray.length; i++){

                  if(myArray[i].length()>longChar.length()){
                      longChar=myArray[i];

                  }

        }
              return longChar;
    }

    public static void main(String[] args) {
        String []myArray={"Alabama","Utah" , "Oregon", "Texas", "Virginia"};
        //String longChar =longCharState(myArray);
        //System.out.println(longChar + " is the largest word in the array");
        System.out.println(longCharState(myArray));

    }
}
