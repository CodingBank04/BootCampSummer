package Arrays;

import java.util.Arrays;

public class MaxValueArray {
    public static void main(String[] args) {
        int [] myArray={12,34,56,76,78,90};
        System.out.println(findMaxValue(myArray));


    }
    public static int findMaxValue(int[]arr){

        int container=arr[0];
         for (int i=1; i<arr.length; i++){
             if(arr[i]>container){
                 container=arr[i];
             }

         }
         return container;
    }
}
