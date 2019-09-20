package Arrays;

import java.util.Arrays;

public class ReturnCommonElement {
    public static void main(String[] args) {
        int [] array1={1,2,3,4,5,6,7,8,9};
        int [] array2={4,5,7,12};
        findCommonReturn(array1,array2);
        int[] resultArray=findCommonReturn(array1,array2);
        System.out.println(Arrays.toString(resultArray));
    }
    public static int [] findCommonReturn(int[] arr1 , int  arr2[]){
        int size=0;
        if(arr1.length>arr2.length){
            size=arr1.length;

        }
        else{
            size=arr2.length;
        }
        int[] returnArray = new int[size];
        for (int i=0; i<arr1.length ; i++){
            for( int j=0; j< arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    returnArray[i] = arr1[i];
                  }


                }
              }
                    return returnArray;
        }

}




